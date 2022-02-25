package com.pandora.studyplatform.controller;

import com.alibaba.fastjson.JSONObject;
import com.pandora.studyplatform.model.Course;
import com.pandora.studyplatform.model.NatureTest;
import com.pandora.studyplatform.service.CourseService;
import com.pandora.studyplatform.service.NatureTestService;
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
    public Boolean loadNatureTest(@RequestBody JSONObject jsonParam){
        ArrayList<String> answers = (ArrayList) jsonParam.get("answers");
        int answer_1 = 0;
        int answer_2 = 0;
        int answer_3 = 0;
        int answer_4 = 0;
        for ( int i = 0; i < answers.size(); i++){
            if ( i % 4 == 0){
                if (answers.get(i).equals("a")){
                    answer_1++;
                }else {
                    answer_1--;
                }
            }else if ( i % 4 == 1){
                if (answers.get(i).equals("a")){
                    answer_2++;
                }else {
                    answer_2--;
                }
            }else if ( i % 4 == 2){
                if (answers.get(i).equals("a")){
                    answer_3++;
                }else {
                    answer_3--;
                }
            }else {
                if (answers.get(i).equals("a")){
                    answer_4++;
                }else {
                    answer_4--;
                }
            }
        }
        String ans = answer_1 > 0 ? answer_1 + "a" : (-answer_1)+ "b";
        ans += answer_2 > 0 ? answer_2 + "a" : (-answer_2)+ "b";
        ans += answer_3 > 0 ? answer_3 + "a" : (-answer_3)+ "b";
        ans += answer_4 > 0 ? answer_4 + "a" : (-answer_4)+ "b";
        System.out.println(ans);
        return true;
    }
}
