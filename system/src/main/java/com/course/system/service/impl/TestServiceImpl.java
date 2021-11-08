package com.course.system.service.impl;

import com.course.system.domain.Test;
import com.course.system.mapper.TestMapper;
import com.course.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Create by  ch
 * @date 2021/11/8
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> list() {
        return testMapper.list();
    }
}