package com.opentelemetry.opentelemetry_learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        Thread.sleep(new Random().nextInt(500)); // 模拟延迟
        return "Hello, OpenTelemetry!";
    }
}
