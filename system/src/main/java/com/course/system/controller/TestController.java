package com.course.system.controller;

import com.course.system.domain.Test;
import com.course.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * @Create by  ch
 * @date 2021/11/8
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public List<Test> list(){
        return testService.list();
    }
}