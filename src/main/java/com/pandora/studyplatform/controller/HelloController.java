package com.pandora.studyplatform.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @author : Pandora
 * 2022/2/12-20:33
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("username", "admin");
        stringStringHashMap.put("password", "123456");
        return JSON.toJSONString(stringStringHashMap);
    }
}
