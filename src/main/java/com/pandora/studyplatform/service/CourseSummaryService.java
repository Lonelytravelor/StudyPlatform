package com.pandora.studyplatform.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.model.CourseSummary;
import com.pandora.studyplatform.mapper.CourseSummaryMapper;

@Service
public class CourseSummaryService {

    @Resource
    private CourseSummaryMapper courseSummaryMapper;


    public int insertSelective(CourseSummary record) {
        return courseSummaryMapper.insertSelective(record);
    }


    public CourseSummary selectByPrimaryKey(Integer summaryId) {
        return courseSummaryMapper.selectByPrimaryKey(summaryId);
    }


    public int updateByPrimaryKey(CourseSummary record) {
        return courseSummaryMapper.updateByPrimaryKey(record);
    }

}

