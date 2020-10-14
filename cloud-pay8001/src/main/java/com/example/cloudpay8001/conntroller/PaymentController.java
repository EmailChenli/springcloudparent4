package com.example.cloudpay8001.conntroller;

import com.example.cloudaipcommons.entity.CommonResult;
import com.example.cloudaipcommons.entity.Payment;
import com.example.cloudpay8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("findAll")
    public CommonResult<?> findAll(){
        log.info("FindAll");
        CommonResult<List<Payment>> commonResult = new CommonResult<>();
        commonResult.setCode(200);
        commonResult.setMessage("Success");
        commonResult.setData(paymentService.findAll());
        return commonResult;
    }

    @PostMapping("add")
    public CommonResult<?> addPayment(@RequestBody Payment payment){
        log.info("FindAll");
        CommonResult<Integer> commonResult = new CommonResult<>();
        commonResult.setCode(200);
        commonResult.setMessage("Success");
        commonResult.setData(paymentService.addPayment(payment));
        return commonResult;
    }

}
