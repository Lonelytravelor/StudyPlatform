package com.pandora.studyplatform.service;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.mapper.StudyStyleMapper;
import com.pandora.studyplatform.model.StudyStyle;
@Service
public class StudyStyleService{

    @Resource
    private StudyStyleMapper studyStyleMapper;

    
    public int insertSelective(StudyStyle record) {
        return studyStyleMapper.insertSelective(record);
    }

    
    public StudyStyle selectByPrimaryKey(Integer styleId) {
        return studyStyleMapper.selectByPrimaryKey(styleId);
    }

    
    public int updateByPrimaryKey(StudyStyle record) {
        return studyStyleMapper.updateByPrimaryKey(record);
    }

	public StudyStyle selectOneByStyleShape(String styleShape){
		 return studyStyleMapper.selectOneByStyleShape(styleShape);
	}




}
