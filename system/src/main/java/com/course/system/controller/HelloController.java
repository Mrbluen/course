package com.course.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Create by  ch
 * @date 2021/11/8
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }
}