package com.pandora.studyplatform.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.pandora.studyplatform.model.UserAccount;
import com.pandora.studyplatform.service.UserAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
//        HashMap<String, String> stringStringHashMap = new HashMap<>();
//        stringStringHashMap.put("username", "admin");
//        stringStringHashMap.put("password", "123456");
//        return JSON.toJSONString(stringStringHashMap);

        return "hello";
    }

    @RequestMapping("/selectAllUser")
    @ResponseBody
    public HashMap<String, Object> selectAllUser(){
        HashMap<String,Object> map = new HashMap<>();
        map.put("data", userAccountService.selectAll());
        map.put("total", userAccountService.countDistinctUserId());
        return map;
    }

    @RequestMapping("/selectPageUser")
    @ResponseBody
    public HashMap<String, Object> selectPageUser(@RequestParam("pageNum") Integer pageNum,@RequestParam("pageSize") Integer pageSize){
        pageNum = (pageNum - 1) * pageSize;
        HashMap<String,Object> map = new HashMap<>();
        map.put("data", userAccountService.selectUsersPage(pageNum, pageSize));
        map.put("total", userAccountService.countDistinctUserId());
        return map;
    }

    @RequestMapping("/add")
    @ResponseBody
    public Boolean add(@RequestBody UserAccount user ){
        System.out.println(user);
        Boolean res = false;
        int insert = userAccountService.insert(user);
        if( insert == 1){
            res = true;
        }
        return res;
    }
}