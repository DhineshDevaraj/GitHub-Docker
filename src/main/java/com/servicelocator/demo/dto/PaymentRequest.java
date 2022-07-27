package com.servicelocator.demo.dto;

import lombok.Data;

@Data
public class PaymentRequest {
    private Long amount;
    private String paymentMethod;
}
