package com.ly.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testlogging")
@EnableAutoConfiguration
public class LoggingTestController {
    private static Logger logger = LoggerFactory.getLogger(LoggingTestController.class);
    @GetMapping("/hello")
    public String hello() {
    	 for(int i=0;i<100000;i++){
             logger.info("info execute index method");
             logger.warn("warn execute index method");
             logger.error("error execute index method");
         }
         return "SpringBoot-log Application";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(LoggingTestController.class, args);
    }
}