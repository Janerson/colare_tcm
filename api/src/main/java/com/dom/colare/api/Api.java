package com.dom.colare.api;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
        "com.dom.colare.api",
        "com.dom.colare.security",
        "com.dom.colare.domain"
})
@EntityScan({
        "com.dom.colare.core",
        "com.dom.colare.domain"
})
@EnableJpaRepositories({"com.dom.colare.data"})
public class Api {
    public static void main(String[] args) {
        SpringApplication.run(Api.class,args);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
        return modelMapper;
    }
}
