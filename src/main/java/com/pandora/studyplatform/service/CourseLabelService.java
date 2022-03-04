package com.pandora.studyplatform.service;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.model.CourseLabel;
import com.pandora.studyplatform.mapper.CourseLabelMapper;
@Service
public class CourseLabelService{

    @Resource
    private CourseLabelMapper courseLabelMapper;

    
    public int insertSelective(CourseLabel record) {
        return courseLabelMapper.insertSelective(record);
    }

    
    public CourseLabel selectByPrimaryKey(Integer labelId) {
        return courseLabelMapper.selectByPrimaryKey(labelId);
    }

    
    public int updateByPrimaryKey(CourseLabel record) {
        return courseLabelMapper.updateByPrimaryKey(record);
    }

	public List<CourseLabel> selectAll(){
		 return courseLabelMapper.selectAll();
	}




}
