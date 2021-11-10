package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.domain.Test;
import com.course.server.dto.ChapterDto;
import com.course.server.dto.PageDto;

import java.util.List;

/**
 * @Create by  ch
 * @date 2021/11/8
 */

public interface ChapterService {
    public void list(PageDto pageDto);
}