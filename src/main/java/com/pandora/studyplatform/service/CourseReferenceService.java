package com.pandora.studyplatform.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.model.CourseReference;
import com.pandora.studyplatform.mapper.CourseReferenceMapper;
@Service
public class CourseReferenceService{

    @Resource
    private CourseReferenceMapper courseReferenceMapper;

    
    public int insertSelective(CourseReference record) {
        return courseReferenceMapper.insertSelective(record);
    }

    
    public CourseReference selectByPrimaryKey(Integer referenceId) {
        return courseReferenceMapper.selectByPrimaryKey(referenceId);
    }

    
    public int updateByPrimaryKey(CourseReference record) {
        return courseReferenceMapper.updateByPrimaryKey(record);
    }

}
