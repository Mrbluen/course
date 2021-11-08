package com.course.system.mapper;

import com.course.system.domain.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Create by  ch
 * @date 2021/11/8
 */
@Mapper
public interface TestMapper {
    public List<Test> list();


}