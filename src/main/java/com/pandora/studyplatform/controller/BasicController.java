package com.pandora.studyplatform.controller;

import com.alibaba.fastjson.JSONObject;
import com.pandora.studyplatform.model.UserAccount;
import com.pandora.studyplatform.model.UserBasic;
import com.pandora.studyplatform.service.UserAccountService;
import com.pandora.studyplatform.service.UserBasicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author : Pandora
 * 2022/2/20-18:01
 * @description：
 */

@Controller
public class BasicController {
    @Resource
    UserAccountService userAccountService;
    @Resource
    UserBasicService userBasicService;

    @RequestMapping("/loadUserAccount")
    @ResponseBody
    public UserAccount loadUserAccount(String phone){
        return userAccountService.selectOneByPhone(phone);
    }

    @RequestMapping("/loadUserBasic")
    @ResponseBody
    public UserBasic loadUserBasic(Integer userId){
        return userBasicService.selectOneByUserId(userId);
    }

    @RequestMapping("/updateBasic")
    @ResponseBody
    public String updateBasic(@RequestBody UserBasic userBasic){
        userBasicService.updateByUserId(userBasic, userBasic.getUserId());
        return "success";
    }

    @RequestMapping("/image")
    @ResponseBody
    public String image(){
        return "http://localhost:9090/image.png";
    }
}
