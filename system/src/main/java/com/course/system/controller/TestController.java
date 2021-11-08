package com.course.system.controller;


import com.course.server.domain.Test;
import com.course.server.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Create by  ch
 * @date 2021/11/8
 */
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/test")
    public List<Test> list(){
        return testService.list();
    }
}