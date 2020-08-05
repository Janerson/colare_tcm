package com.dom.colare.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GerarSenhaUtil {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("02041989"));
    }
}
