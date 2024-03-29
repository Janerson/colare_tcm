package com.dom.colare.security.token;

import org.apache.catalina.util.ParameterMap;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.Map;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RefreshTokenCookiePreProcessorFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        if (req.getRequestURI().endsWith("/oauth/token")
                && "refresh_token".equals(req.getParameter("grant_type"))
                && req.getCookies() != null) {
            for (Cookie cookie : req.getCookies()) {
                if (cookie.getName().equals("refresh_token")) {
                    String refreshToken = cookie.getValue();
                    req = new ServeletRequestWrapper(req, refreshToken);
                }
            }
        }
        chain.doFilter(req,response);
    }

    static class ServeletRequestWrapper extends HttpServletRequestWrapper {

        private final String refreshToken;

        public ServeletRequestWrapper(HttpServletRequest request, String refreshToken) {
            super(request);
            this.refreshToken = refreshToken;
        }

        @Override
        public Map<String, String[]> getParameterMap() {
            ParameterMap<String,String[]> map = new ParameterMap<>(getRequest().getParameterMap());
            map.put("refresh_token",new String[]{refreshToken});
            map.setLocked(true);
            return map;
        }
    }
}
