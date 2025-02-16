package com.example.assignment;

import org.springframework.stereotype.Repository;

@Repository  // Аннотация для бина
public class MyRepository {
    public String getData() {
        return "Data from MyRepository";
    }
}
