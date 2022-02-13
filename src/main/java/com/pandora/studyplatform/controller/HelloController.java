package com.pandora.studyplatform.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.pandora.studyplatform.model.UserAccount;
import com.pandora.studyplatform.service.UserAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author : Pandora
 * 2022/2/12-20:33
 */
@Controller
public class HelloController {

    @Resource
    UserAccountService userAccountService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("username", "admin");
        stringStringHashMap.put("password", "123456");
        return JSON.toJSONString(stringStringHashMap);
    }

    @RequestMapping("/selectAllUser")
    @ResponseBody
    public List<UserAccount> selectAllUser(){
        return userAccountService.selectAll();
    }
}
