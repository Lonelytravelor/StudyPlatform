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
 * 2022/2/16-9:53
 * @description：这个类负责提供注册，登录等接口
 */

@Controller
public class LoginController {
    @Resource
    UserAccountService userAccountService;
    @Resource
    UserBasicService userBasicService;

    @RequestMapping("/login")
    @ResponseBody
    public Boolean login(@RequestBody JSONObject jsonParam){
        String userName = jsonParam.getString("userName");
        String password = jsonParam.getString("password");
        Boolean res = false;
        UserAccount userAccount = userAccountService.loginByUserName(userName);
        if ( userAccount != null){
            if ( password.equals(userAccount.getUserPassword()) ){
                res = true;
            }
        }
        return res;
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
        }
        return res;
    }
}
