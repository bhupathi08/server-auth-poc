package com.demistifycode.serverauthpoc.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

class DemoControllerTest {

    private DemoController demoController;

    @BeforeEach
    void setUp() {
        demoController = new DemoController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDefault() {
        ResponseEntity<String> output = demoController.getDefault();
        Assertions.assertEquals("Welcome to server-auth-poc!!!", output.getBody());
    }
}