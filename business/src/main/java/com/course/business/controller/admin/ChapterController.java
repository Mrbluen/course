package com.course.business.controller.admin;


import com.course.server.dto.PageDto;
import com.course.server.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Create by  ch
 * @date 2021/11/8
 */
@RestController
@RequestMapping("/admin")
public class ChapterController {

    private static final Logger LOG = LoggerFactory.getLogger(ChapterController.class);
    @Resource
    private ChapterService chapterService;

    @PostMapping("/chapter")
    public PageDto list(@RequestBody PageDto pageDto){
         chapterService.list(pageDto);
        return pageDto;
    }
}