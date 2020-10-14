package com.example.cloudpay8001.config;

import com.example.cloudpay8001.impl.PaymentServiceImpl;
import com.example.cloudpay8001.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ConfigurationBean {
    @Bean
    public PaymentService paymentService(@Autowired PaymentServiceImpl bean){
        System.out.println("::"+Arrays.toString(bean.findAll().toArray()));
        return bean;
    }
}
