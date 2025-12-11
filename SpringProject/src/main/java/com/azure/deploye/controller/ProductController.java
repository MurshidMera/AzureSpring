package com.azure.deploye.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    // http://localhost:9090/get

    @GetMapping("/get")
    public String testExecution(){
        return "Controller is Executing. ";
    }
}
