package com.pandora.studyplatform.controller;

import com.alibaba.fastjson.JSONObject;
import com.pandora.studyplatform.model.*;
import com.pandora.studyplatform.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

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
    @Resource
    private CourseAnnouncementService courseAnnouncementService;
    @Resource
    private CourseReferenceService courseReferenceService;
    @Resource
    private UserCourseService userCourseService;
    @Resource
    private CourseLabelService courseLabelService;

    @RequestMapping("/loadCourseById")
    @ResponseBody
    public Course loadCourseById(Integer id){
        Course course = courseService.selectOneByCourseId(id);
//        获取Summary并注入
        if (course.getCourseSummaryId() != null ){
            Integer courseSummaryId = course.getCourseSummaryId();
            CourseSummary courseSummary = courseSummaryService.selectByPrimaryKey(courseSummaryId);
            course.setCourseSummary(courseSummary);
        }
//        获取courseReferenceList并注入
        if (course.getCourseReferenceId() != null && !Objects.equals(course.getCourseReferenceId(), "")){
            List<CourseReference> courseReferenceList = new LinkedList<>();
            String[] strings = course.getCourseReferenceId().split(",");
            for ( String s : strings ){
                CourseReference courseReference = courseReferenceService.selectByPrimaryKey(Integer.valueOf(s));
                courseReferenceList.add(courseReference);
            }
            course.setCourseReferenceList(courseReferenceList);
        }
//        获取Summary并注入
        if (course.getCourseAnnouncementId() != null && !Objects.equals(course.getCourseAnnouncementId(), "")){
            List<CourseAnnouncement> courseAnnouncementList = new LinkedList<>();
            String[] strings = course.getCourseAnnouncementId().split(",");
            for ( String s : strings ){
                CourseAnnouncement courseAnnouncement = courseAnnouncementService.selectByPrimaryKey(Integer.valueOf(s));
                courseAnnouncementList.add(courseAnnouncement);
            }
            course.setCourseAnnouncementList(courseAnnouncementList);
        }
        return course;
    }

    @RequestMapping("/loadPersonCourses")
    @ResponseBody
    public List<Course> loadPersonCourses(@RequestBody JSONObject jsonParam){
        Integer id = jsonParam.getInteger("id");
        UserCourse userCourse = userCourseService.selectByPrimaryKey(id);
        String coursesId = userCourse.getCoursesId();
        if ( coursesId != null ){
            String[] strings = coursesId.split(",");
            List<Course> courses = new LinkedList<>();
            for( String s : strings){
                Course course = courseService.selectOneByCourseId(Integer.valueOf(s));
                courses.add(course);
            }
            return courses;
        }
        return null;
    }

    @RequestMapping("/loadCourseSummary")
    @ResponseBody
    public Map<String, List<Course>> loadCourseSummary(){
        List<CourseLabel> courseLabels = courseLabelService.selectAll();
        Map<String, List<Course>> courseSummaryMap = new HashMap<>();
        for ( CourseLabel c : courseLabels){
            courseSummaryMap.put(c.getLabel(), courseService.selectAllByCourseLabelLimit(c.getLabel()));
        }
        return courseSummaryMap;
    }

    @RequestMapping("/loadAllCourseByLabel")
    @ResponseBody
    public List<Course> loadAllCourseByLabel(String label){
        return courseService.selectAllByCourseLabel(label);
    }

    @RequestMapping("/updateUserCourseByUserId")
    @ResponseBody
    public String updateUserCourseByUserId(@RequestBody JSONObject jsonParam){
        Integer userId = jsonParam.getInteger("userId");
        String courseId = jsonParam.getString("courseId");
        String coursesId = userCourseService.selectOneCoursesIdByUserid(userId);
        if (coursesId.contains(courseId)){
            return "fail";
        }
        coursesId = (coursesId + "," + courseId);
        userCourseService.updateCoursesIdByUserid(coursesId, userId);
        return "success";
    }

    @RequestMapping("/isSelectCourse")
    @ResponseBody
    public Boolean isSelectCourse(@RequestBody JSONObject jsonParam){
        Integer userId = jsonParam.getInteger("userId");
        String courseId = jsonParam.getString("courseId");
        String coursesId = userCourseService.selectOneCoursesIdByUserid(userId);
        if (coursesId.contains(courseId)){
            return true;
        }
        return false;
    }
}
