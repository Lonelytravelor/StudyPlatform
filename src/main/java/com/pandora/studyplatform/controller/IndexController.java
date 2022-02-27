package com.pandora.studyplatform.controller;

import com.alibaba.fastjson.JSONObject;
import com.pandora.studyplatform.model.Course;
import com.pandora.studyplatform.model.NatureTest;
import com.pandora.studyplatform.model.StudyStyle;
import com.pandora.studyplatform.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author : Pandora
 * 2022/2/18-20:23
 * @description：
 */
@Controller
public class IndexController {

    @Resource
    CourseService courseService;
    @Resource
    NatureTestService natureTestService;
    @Resource
    StudyStyleService studyStyleService;
    @Resource
    UserAccountService userAccountService;
    @Resource
    UserBasicService basicService;

    @RequestMapping("/loadCourse")
    @ResponseBody
    public List<Course> loadIndexCourse(){
        return courseService.selectIndexCourse();
    }

    @RequestMapping("/loadAllCourse")
    @ResponseBody
    public List<Course> loadAllCourse(){
        return courseService.selectAll();
    }

    @RequestMapping("/loadNatureTest")
    @ResponseBody
    public List<NatureTest> loadNatureTest(){
        return natureTestService.selectAll();
    }

    @RequestMapping("/updateNatureTest")
    @ResponseBody
    public StudyStyle loadNatureTest(@RequestBody JSONObject jsonParam){
        ArrayList<String> answers = (ArrayList) jsonParam.get("answers");
        String userName = jsonParam.getString("userName");
        int answer_1 = 0;
        int answer_2 = 0;
        int answer_3 = 0;
        int answer_4 = 0;
        for ( int i = 0; i < answers.size(); i+=4){
            int a = answers.get(i).equals("a") ? answer_1++ : answer_1--;
            a = answers.get(i+1).equals("a") ? answer_2++ : answer_2--;
            a = answers.get(i+2).equals("a") ? answer_3++ : answer_3--;
            a = answers.get(i+3).equals("a") ? answer_4++ : answer_4--;
        }
        String ans = answer_1 > 0 ?  "a" :  "b";
        ans += answer_2 > 0 ?  "a" : "b";
        ans += answer_3 > 0 ?  "a" : "b";
        ans += answer_4 > 0 ?  "a" : "b";
        Integer id = userAccountService.selectOneUserIdByUserPhone(userName);
        StudyStyle studyStyle = selectStudyStyleByShape(ans);
        basicService.updateUserStudyStelyIdByUserId(studyStyle.getStyleId(), id);
        return studyStyle;
    }

    public StudyStyle selectStudyStyleByShape(String shape){
        return studyStyleService.selectOneByStyleShape(shape);
    }


}
