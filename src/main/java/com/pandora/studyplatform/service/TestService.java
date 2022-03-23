package com.pandora.studyplatform.service;
import java.util.List;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.model.Test;
import com.pandora.studyplatform.mapper.TestMapper;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;


    public int insertSelective(Test record) {
        return testMapper.insertSelective(record);
    }


    public Test selectByPrimaryKey(Integer testId) {
        return testMapper.selectByPrimaryKey(testId);
    }


    public int updateByPrimaryKey(Test record) {
        return testMapper.updateByPrimaryKey(record);
    }

    public Test selectOneByTestTime(LocalDateTime testTime) {
        return testMapper.selectOneByTestTime(testTime);
    }

    public Integer selectOneTestIdByTestTime(LocalDateTime testTime) {
        return testMapper.selectOneTestIdByTestTime(testTime);
    }

    public Integer selectOneTestId() {
        return testMapper.selectOneTestId();
    }

    public int updateTestScoreAndTestAnswerListAndTestStateByTestId(Integer updatedTestScore, String updatedTestAnswerList, String updatedTestState, Integer testId) {
        return testMapper.updateTestScoreAndTestAnswerListAndTestStateByTestId(updatedTestScore, updatedTestAnswerList, updatedTestState, testId);
    }

    public Test selectSimpleOneByTestId(Integer testId) {
        return testMapper.selectOneByTestId(testId);
    }

    public Test selectOneByTestIdAndTestTitle(Integer testId, String testTitle) {
        return testMapper.selectOneByTestIdAndTestTitle(testId, testTitle);
    }


}


