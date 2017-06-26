package com.lgd.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : linguodong
 * Create : 2017/6/26
 * Update : 2017/6/26
 * Descriptions :
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String say() {
        return "Hello SpringBoot";
    }
}
