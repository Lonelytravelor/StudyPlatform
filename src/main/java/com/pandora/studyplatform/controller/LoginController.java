package com.pandora.studyplatform.controller;

import com.alibaba.fastjson.JSONObject;
import com.pandora.studyplatform.model.UserAccount;
import com.pandora.studyplatform.model.UserBasic;
import com.pandora.studyplatform.model.UserCourse;
import com.pandora.studyplatform.service.UserAccountService;
import com.pandora.studyplatform.service.UserBasicService;
import com.pandora.studyplatform.service.UserCourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author : Pandora
 * 2022/2/16-9:53
 * @description：这个类负责提供注册，登录等接口
 */

@Controller
public class LoginController {
    @Resource
    UserAccountService userAccountService;
    @Resource
    UserBasicService userBasicService;
    @Resource
    UserCourseService userCourseService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestBody JSONObject jsonParam){
        String userName = jsonParam.getString("userName");
        String password = jsonParam.getString("password");
        String res = "false";
        Integer id = -1;
        UserAccount userAccount = userAccountService.loginByUserName(userName);
        if ( userAccount != null){
            if ( password.equals(userAccount.getUserPassword()) ) {
                res = "true";
                id = userAccountService.selectOneUserIdByUserPhone(userName);
                Integer integer = userBasicService.selectOneUserStudyStelyIdByUserId(id);
                if ( integer == null ){
                    res = "unTest";
                }
            }
        }
        return (id + "," + res);
    }

    @RequestMapping("/register")
    @ResponseBody
    public Boolean register(@RequestBody JSONObject jsonParam){
        Boolean res = false;
        String phone = jsonParam.getString("userName");
        String password = jsonParam.getString("password");
        UserAccount userAccount = userAccountService.selectOneByPhone(phone);
        if (userAccount == null){
            res = userAccountService.register(new UserAccount(phone, password));
            Integer id = userAccountService.selectOneUserIdByUserPhone(phone);
            res = userBasicService.insertSelective(new UserBasic(id));
            res = userCourseService.insertSelective(new UserCourse(id));
        }
        return res;
    }


}
