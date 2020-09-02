package com.dom.colare.security;

import com.github.f4b6a3.uuid.UuidCreator;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.UUID;

public class GerarSenhaUtil {
    public static void main(String[] args) {
       UUID uuid = UuidCreator.getTimeOrdered();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    }
}
