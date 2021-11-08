package com.course.server.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.course.server.domain.Test;

import java.util.List;

/**
 * @Create by  ch
 * @date 2021/11/8
 */
@Mapper
public interface TestMapper {
    public List<Test> list();


}