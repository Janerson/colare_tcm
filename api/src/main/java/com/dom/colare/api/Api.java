package com.dom.colare.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {
        "com.dom.colare.core"
})
@EntityScan({"com.dom.colare.core"})
public class Api {
    public static void main(String[] args) {
        SpringApplication.run(Api.class,args);
    }
}
