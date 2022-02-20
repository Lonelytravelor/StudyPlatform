package com.pandora.studyplatform.controller;

import com.pandora.studyplatform.model.Course;
import com.pandora.studyplatform.model.NatureTest;
import com.pandora.studyplatform.service.CourseService;
import com.pandora.studyplatform.service.NatureTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : Pandora
 * 2022/2/18-20:23
 * @description：
 */
@Controller
public class IndexController {

    @Resource
    CourseService courseService;
    @Resource
    NatureTestService natureTestService;

    @RequestMapping("/loadCourse")
    @ResponseBody
    public List<Course> loadIndexCourse(){
        return courseService.selectIndexCourse();
    }

    @RequestMapping("/loadAllCourse")
    @ResponseBody
    public List<Course> loadAllCourse(){
        return courseService.selectAll();
    }

    @RequestMapping("/loadNatureTest")
    @ResponseBody
    public List<NatureTest> loadNatureTest(){
        return natureTestService.selectAll();
    }
}
