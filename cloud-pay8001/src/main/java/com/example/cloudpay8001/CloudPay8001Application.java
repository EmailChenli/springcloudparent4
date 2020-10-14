package com.example.cloudpay8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.cloudpay8001.*","com.example.cloudpay8001.mapper","com.example.cloudpay8001.config"})
public class CloudPay8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudPay8001Application.class, args);
    }

}
