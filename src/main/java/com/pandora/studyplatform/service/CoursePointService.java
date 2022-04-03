package com.pandora.studyplatform.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.mapper.CoursePointMapper;
import com.pandora.studyplatform.model.CoursePoint;
@Service
public class CoursePointService{

    @Resource
    private CoursePointMapper coursePointMapper;

    
    public int insertSelective(CoursePoint record) {
        return coursePointMapper.insertSelective(record);
    }

    
    public CoursePoint selectByPrimaryKey(Integer courseId) {
        return coursePointMapper.selectByPrimaryKey(courseId);
    }

    
    public int updateByPrimaryKey(CoursePoint record) {
        return coursePointMapper.updateByPrimaryKey(record);
    }

}
