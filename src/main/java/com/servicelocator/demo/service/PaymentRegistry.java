package com.servicelocator.demo.service;

public interface PaymentRegistry {
    PaymentService getServiceBean(String serviceName);
}
