package com.course.business.controller.admin;


import com.course.server.domain.Chapter;
import com.course.server.dto.ChapterDto;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Create by  ch
 * @date 2021/11/8
 */
@RestController
@RequestMapping("/admin")
public class ChapterController {
    @Resource
    private ChapterService chapterService;

    @GetMapping("/chapter")
    public List<ChapterDto> list(){
        return chapterService.list();
    }
}