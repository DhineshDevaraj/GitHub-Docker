package com.servicelocator.demo.service;

import com.servicelocator.demo.dto.PaymentRequest;
import org.springframework.stereotype.Service;

@Service("phonepe")
public class PhonePe implements PaymentService {

    @Override
    public String pay(PaymentRequest paymentRequest) {
        return paymentRequest.getAmount() + " paid through "+ paymentRequest.getPaymentMethod().toUpperCase();
    }
}