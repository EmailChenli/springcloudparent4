package com.example.cloudolder80.controller;

import com.example.cloudaipcommons.entity.CommonResult;
import com.example.cloudaipcommons.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("older80")
public class OlderController {
    public static final  String PEYMENT_URL ="http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("")
    public CommonResult<Payment> addPayment(@RequestBody Payment payment){
        //post请求
        return restTemplate.postForObject(PEYMENT_URL+"/",payment,CommonResult.class);
    }

    @GetMapping("{id}")
    public  CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        //get请求
        return restTemplate.getForObject(PEYMENT_URL+"/"+id,CommonResult.class);
    }

    @GetMapping("findAll")
    public CommonResult<List<Payment>> findAll(){
        return  restTemplate.getForObject(PEYMENT_URL+"payment/findAll",CommonResult.class);
    }

}
