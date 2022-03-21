package com.pandora.studyplatform.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.model.Question;
import com.pandora.studyplatform.mapper.QuestionMapper;

@Service
public class QuestionService {

    @Resource
    private QuestionMapper questionMapper;


    public int insertSelective(Question record) {
        return questionMapper.insertSelective(record);
    }


    public Question selectByPrimaryKey(Integer questionId) {
        return questionMapper.selectByPrimaryKey(questionId);
    }


    public int updateByPrimaryKey(Question record) {
        return questionMapper.updateByPrimaryKey(record);
    }

    public List<Question> selectAll() {
        return questionMapper.selectAll();
    }

    public List<Question> selectAllByQuestionSectionAndCourseId(String likeQuestionSection, Integer courseId) {
        List<Question> questions = new ArrayList<>();
        questions.addAll(questionMapper.selectAllByQuestionSectionAndQuestionCourseIdByJudge(likeQuestionSection, courseId));
        questions.addAll(questionMapper.selectAllByQuestionSectionAndQuestionCourseIdBySingle(likeQuestionSection, courseId));
        questions.addAll(questionMapper.selectAllByQuestionSectionAndQuestionCourseIdByMultiple(likeQuestionSection, courseId));
        return questions;
    }

}


