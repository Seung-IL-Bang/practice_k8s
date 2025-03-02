package com.example.spring_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${MY_ACCOUNT:default}")
    private String account;

    @Value("${MY_PASSWORD:default}")
    private String password;

    @GetMapping("/")
    public String hello() {
        return "Hello, World! version 1.0";
    }

    @GetMapping("/config")
    public String config() {
        return "Account: " + account + ", Password: " + password;
    }
}
