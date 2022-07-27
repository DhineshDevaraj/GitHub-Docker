package com.servicelocator.demo.controller;

import com.servicelocator.demo.dto.PaymentRequest;
import com.servicelocator.demo.service.PaymentRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class PaymentController {

    @Autowired
    PaymentRegistry paymentRegistry;

    @PostMapping("/pay")
    public String pay(@RequestBody PaymentRequest paymentRequest){
        String response = "";
        response = paymentRegistry.getServiceBean(paymentRequest.getPaymentMethod().toLowerCase()).pay(paymentRequest);
        return response;
    }
}
