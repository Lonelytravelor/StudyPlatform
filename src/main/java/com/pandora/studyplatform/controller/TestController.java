package com.pandora.studyplatform.controller;

import com.pandora.studyplatform.model.Question;
import com.pandora.studyplatform.model.Test;
import com.pandora.studyplatform.model.TestUser;
import com.pandora.studyplatform.service.QuestionService;
import com.pandora.studyplatform.service.TestService;
import com.pandora.studyplatform.service.TestUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author : Pandora
 * 2022/3/19-14:25
 * @description：
 */

@Controller
public class TestController {
    @Resource
    private QuestionService questionService;
    @Resource
    private TestService testService;
    @Resource
    private TestUserService testUserService;

    @RequestMapping("/createTest")
    @ResponseBody
    public Test createTest(String title, Integer userId){
        Test test = new Test();
        test.setTestTitle(title);
        LocalDateTime now = LocalDateTime.now();
        test.setTestTime(now);
        test.setTestNum(20);
        List<Question> questions = questionService.selectAll();
        test.setQuestionList(questions);
        String questionList = questions.get(0).getQuestionId().toString();
        for (int i = 1; i < questions.size(); i++){
            questionList += ",";
            questionList += questions.get(i).getQuestionId().toString();
        }
        test.setTestQuestionList(questionList);
        testService.insertSelective(test);
        Integer testId = testService.selectOneTestId();
        TestUser testUser = new TestUser(testId, userId);
        testUserService.insertSelective(testUser);
        return test;
    }
}
