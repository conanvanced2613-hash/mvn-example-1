package com.example.application;

import com.example.service.SampleService;

public class Application {
    public static void main(String[] args) {
        SampleService service = new SampleService();
        System.out.println("Message from service: " + service.getMessage());
    }
}