package com.dom.colare.api.endpoints.security;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("${api.token-logout}")
public class TokenController {

    @DeleteMapping
    public void logout(HttpServletRequest req, HttpServletResponse resp){
        Cookie cookie =  new Cookie("refresh_token", null);
        cookie.setHttpOnly(true);
        cookie.setSecure(false);//TODO mudar para true em produção
        cookie.setPath(req.getContextPath() + "/oauth/token");
        cookie.setMaxAge(0);

        resp.addCookie(cookie);
        resp.setStatus(HttpStatus.NO_CONTENT.value());

    }
}
