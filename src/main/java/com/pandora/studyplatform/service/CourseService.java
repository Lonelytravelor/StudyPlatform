package com.pandora.studyplatform.service;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.model.Course;
import com.pandora.studyplatform.mapper.CourseMapper;

@Service
public class CourseService {

    @Resource
    private CourseMapper courseMapper;


    public int insertSelective(Course record) {
        return courseMapper.insertSelective(record);
    }


    public Course selectByPrimaryKey(Integer courseId) {
        return courseMapper.selectByPrimaryKey(courseId);
    }


    public int updateByPrimaryKey(Course record) {
        return courseMapper.updateByPrimaryKey(record);
    }

    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }

    public List<Course> selectIndexCourse() {
        return courseMapper.selectIndexCourse();
    }

    public Course selectOneByCourseId(Integer courseId) {
        return courseMapper.selectOneByCourseId(courseId);
    }

    public List<Course> selectAllByCourseLabel(String courseLabel) {
        return courseMapper.selectAllByCourseLabel(courseLabel);
    }

    public List<Course> selectAllByCourseLabelLimit(String courseLabel) {
        return courseMapper.selectAllByCourseLabelLimit(courseLabel);
    }

    public List<Course> selectByCourseNameLike(String likeCourseName) {
        return courseMapper.selectByCourseNameLike(likeCourseName);
    }

	public List<String> selectCourseUniversity(){
		 return courseMapper.selectCourseUniversity();
	}

    public List<Course> selectAllByCourseUniversityLimit(String courseUniversity) {
        return courseMapper.selectAllByCourseUniversityLimit(courseUniversity);
    }



}



