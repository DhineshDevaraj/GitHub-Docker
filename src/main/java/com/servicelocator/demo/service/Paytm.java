package com.servicelocator.demo.service;

import com.servicelocator.demo.dto.PaymentRequest;
import org.springframework.stereotype.Service;

@Service("paytm")
public class Paytm implements PaymentService{

    @Override
    public String pay(PaymentRequest paymentRequest) {
        return paymentRequest.getAmount() + " paid through "+ paymentRequest.getPaymentMethod().toUpperCase();
    }
}