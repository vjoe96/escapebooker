package com.js.booker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookerController {

    @RequestMapping(value = "/hello")
    public String index() {
        return "hello world";
    }
}


