package com.example.cloudpay8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.cloudpay8002.*","com.example.cloudpay8002.mapper","com.example.cloudpay8002.config"})
public class CloudPay8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudPay8002Application.class, args);
    }

}
