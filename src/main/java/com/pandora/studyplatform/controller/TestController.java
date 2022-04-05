package com.pandora.studyplatform.controller;

import com.alibaba.fastjson.JSONObject;
import com.pandora.studyplatform.DAO.PointRepository;
import com.pandora.studyplatform.model.Point;
import com.pandora.studyplatform.model.Question;
import com.pandora.studyplatform.model.Test;
import com.pandora.studyplatform.model.TestUser;
import com.pandora.studyplatform.service.QuestionService;
import com.pandora.studyplatform.service.TestService;
import com.pandora.studyplatform.service.TestUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
    @Resource
    PointRepository pointRepository;

    @RequestMapping("/createTest")
    @ResponseBody
    public Test createTest(String title, Integer userId, Integer courseId){
        Test test = new Test();
        test.setTestTitle(title);
        LocalDateTime now = LocalDateTime.now();
        test.setTestTime(now);
        test.setTestNum(20);
        test.setTestCourseId(courseId);
        List<Question> questions = questionService.selectAllByQuestionSectionAndCourseId(title, courseId);
        test.setQuestionList(questions);
        if (questions.size() == 0){
            return null;
        }
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

    @RequestMapping("/submitTest")
    @ResponseBody
    public void submitTest(@RequestBody JSONObject jsonParam){
        Integer testId = jsonParam.getInteger("testId");
        Integer testScore = jsonParam.getInteger("testScore");
        ArrayList<String> singleAnswers = (ArrayList<String>) jsonParam.get("singleAnswers");
        ArrayList<ArrayList<String>> multipleAnswers = (ArrayList<ArrayList<String>> ) jsonParam.get("multipleAnswers");
        System.out.println(testId);
        System.out.println(testScore);
        int i = 0;
        String answers = singleAnswers.get(i);
        for (i = 1; i < singleAnswers.size(); i++){
            answers += ",";
            answers += singleAnswers.get(i);
        }
        for (; i < multipleAnswers.size(); i++){
            answers += ",";
            for (int j = 0; j < multipleAnswers.get(i).size(); j++){
                answers += multipleAnswers.get(i).get(j);
            }
        }
        System.out.println(answers);
        testService.updateTestScoreAndTestAnswerListAndTestStateByTestId(testScore, answers, "已完成", testId);
    }

    @RequestMapping("/loadHistoricalTest")
    @ResponseBody
    public List<Test> loadHistoricalTest(@RequestBody JSONObject jsonParam){
        Integer userId = jsonParam.getInteger("userId");
        Integer courseId = jsonParam.getInteger("courseId");
        List<Test> testList = new ArrayList<>();
        List<TestUser> testUsers = testUserService.selectAllByUserId(userId);
        for (TestUser test : testUsers){
            Test test1 = testService.selectOneByTestIdAndTestCourseId(test.getTestId(), courseId);
            if (test1 != null){
                testList.add(test1);
            }
        }
        return testList;
    }

    @RequestMapping("/loadHistoricalTestByTestId")
    @ResponseBody
    public Test loadHistoricalTestByTestId(Integer testId){
        List<Question> questions = new ArrayList<>();
        Test test = testService.selectByPrimaryKey(testId);
        String[] questionArray = test.getTestQuestionList().split(",");
        for (String id : questionArray){
            questions.add(questionService.selectByPrimaryKey(Integer.valueOf(id)));
        }
        test.setQuestionList(questions);
        return test;
    }

    @RequestMapping("/loadPrePoint")
    @ResponseBody
    public List<Point> loadPrePoint(String point){
        System.out.println("here");
        List<Point> prePoints = pointRepository.findPrePointById(point);
        for (Point point1 : prePoints) {
            List<Point> point2 = pointRepository.findSubPointById(point1.getName());
            for (Point point3 : point2 ){
                String file = point3.getFile();
                if (file != null){
                    List<String> files = new ArrayList<>();
                    String[] split = file.split(";");
                    for (String s : split){
                        files.add(s);
                    }
                    point3.setFileList(files);
                }
                String video = point3.getVideo();
                if ( video != null ){
                    List<String> videos = new ArrayList<>();
                    String[] split = video.split(";");
                    for (String s : split){
                        videos.add(s);
                    }
                    point3.setVideoList(videos);
                }
            }
            point1.setNextPoints(point2);
        }
        return prePoints;
    }
}
