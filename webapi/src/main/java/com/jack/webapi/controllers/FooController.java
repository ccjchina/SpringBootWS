package com.jack.webapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
        System.out.println("/demo");
        return "hello,FooController/dmo!";
    }
}
