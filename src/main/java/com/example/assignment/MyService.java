package com.example.assignment;

import org.springframework.stereotype.Service;

@Service  // Аннотация для бина
public class MyService {
    public void performService() {
        System.out.println("MyService is performing an operation...");
    }
}
