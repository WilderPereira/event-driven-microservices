package com.wilderpereira.producerservice.controller;

import com.wilderpereira.producerservice.service.ProducerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/greet/{name}")
    public void greet(@PathVariable String name) {
        String greeting = "Hello, " + name + "!";
        producerService.publish(greeting);
    }
}
