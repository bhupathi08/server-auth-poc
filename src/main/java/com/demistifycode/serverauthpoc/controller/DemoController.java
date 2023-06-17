package com.demistifycode.serverauthpoc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    Logger logger = LoggerFactory.getLogger(DemoController.class);
    @GetMapping
    public ResponseEntity<String> getDefault() {
        logger.info("A default method log message");
        return new ResponseEntity<>("Welcome to server-auth-poc!!!", HttpStatus.OK);
    }
}
