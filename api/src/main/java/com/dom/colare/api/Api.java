package com.dom.colare.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
        "com.dom.colare.api",
        "com.dom.colare.security"
})
@EntityScan({"com.dom.colare.core"})
@EnableJpaRepositories({"com.dom.colare.data"})
public class Api {
    public static void main(String[] args) {
        SpringApplication.run(Api.class,args);
    }
}
