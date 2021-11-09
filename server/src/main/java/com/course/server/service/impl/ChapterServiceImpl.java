package com.course.server.service.impl;

import com.course.server.domain.Chapter;
import com.course.server.domain.ChapterExample;
import com.course.server.domain.Test;
import com.course.server.domain.TestExample;
import com.course.server.dto.ChapterDto;
import com.course.server.mapper.ChapterMapper;
import com.course.server.mapper.TestMapper;
import com.course.server.service.ChapterService;
import com.course.server.service.TestService;
import com.course.server.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Create by  ch
 * @date 2021/11/8
 */
@Service
public class ChapterServiceImpl implements ChapterService {

    @Autowired
    private ChapterMapper chapterMapper;

    @Override
    public List<ChapterDto> list() {
        ChapterExample chapterExample = new ChapterExample();
        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);
        List<ChapterDto> categoryDtoList = CopyUtil.copyList(chapterList, ChapterDto.class);
//        for (int i = 0, l= chapterList.size(); i<1; i++) {
//            Chapter chapter = chapterList.get(i);
//            ChapterDto chapterDto = new ChapterDto();
//            BeanUtils.copyProperties(chapter,chapterDto);
//            chapterDtos.add(chapterDto);
//        }
        return categoryDtoList;
    }
}