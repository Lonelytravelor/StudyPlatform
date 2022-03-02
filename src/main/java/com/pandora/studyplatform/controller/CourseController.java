package com.pandora.studyplatform.controller;

import com.pandora.studyplatform.model.Course;
import com.pandora.studyplatform.model.CourseReference;
import com.pandora.studyplatform.model.CourseSummary;
import com.pandora.studyplatform.service.CourseReferenceService;
import com.pandora.studyplatform.service.CourseService;
import com.pandora.studyplatform.service.CourseSummaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : Pandora
 * 2022/3/2-17:26
 * @description：
 */
@Controller
public class CourseController {
    @Resource
    private CourseService courseService;
    @Resource
    private CourseSummaryService courseSummaryService;
//    @Resource
//    private CourseAnnouncementService courseAnnouncementService;
    @Resource
    private CourseReferenceService courseReferenceService;

    @RequestMapping("/loadCourseById")
    @ResponseBody
    public Course loadCourseById(Integer id){
        Course course = courseService.selectOneByCourseId(id);
//        获取Summary并注入
        Integer courseSummaryId = course.getCourseSummaryId();
        CourseSummary courseSummary = courseSummaryService.selectByPrimaryKey(courseSummaryId);
        course.setCourseSummary(courseSummary);
//        获取courseReferenceList并注入
        List<CourseReference> courseReferenceList = new LinkedList<>();
        String[] strings = course.getCourseReferenceId().split(",");
        for ( String s : strings ){
            CourseReference courseReference = courseReferenceService.selectByPrimaryKey(Integer.valueOf(s));
            courseReferenceList.add(courseReference);
        }
        course.setCourseReferenceList(courseReferenceList);
//        获取Summary并注入
//        List<CourseAnnouncement> courseAnnouncementList = new LinkedList<>();
//        strings = course.getCourseAnnouncementId().split(",");
//        for ( String s : strings ){
//            CourseAnnouncement courseAnnouncement = courseAnnouncementService.selectByPrimaryKey(Integer.valueOf(s));
//            courseAnnouncementList.add(courseAnnouncement);
//        }
//        course.setCourseAnnouncementList(courseAnnouncementList);
        return course;
    }
}
