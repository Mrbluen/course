package com.course.server.service.impl;

import com.course.server.domain.TestExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.course.server.domain.Test;
import com.course.server.mapper.TestMapper;
import com.course.server.service.TestService;

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
        TestExample testExample = new TestExample();
        testExample.setOrderByClause("id asc");
        return testMapper.selectByExample(testExample);
    }
}