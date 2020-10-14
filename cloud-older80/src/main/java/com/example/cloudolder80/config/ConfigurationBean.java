package com.example.cloudolder80.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Configuration
public class ConfigurationBean {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
