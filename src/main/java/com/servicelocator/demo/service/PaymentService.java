package com.servicelocator.demo.service;

import com.servicelocator.demo.dto.PaymentRequest;

public interface PaymentService {
    String pay(PaymentRequest paymentRequest);
}
