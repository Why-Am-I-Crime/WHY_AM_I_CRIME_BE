package com.backend.why_am_i_crime.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping()
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/api/test")
    public String test(){
        return "test";
    }
}