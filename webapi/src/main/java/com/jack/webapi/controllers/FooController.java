package com.jack.webapi.controllers;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class FooController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
        System.out.println("/demo");
        logger.info("/demo");
        return "hello,FooController/dmo!";
    }

    public void Test() {
        AtomicInteger atomicInter = new AtomicInteger();
    }
}
