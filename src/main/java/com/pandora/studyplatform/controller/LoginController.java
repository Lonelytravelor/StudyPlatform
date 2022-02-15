package com.pandora.studyplatform.controller;

import com.alibaba.fastjson.JSONObject;
import com.pandora.studyplatform.model.UserAccount;
import com.pandora.studyplatform.service.UserAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author : Pandora
 * 2022/2/15-23:03
 */
@Controller
public class LoginController {
    @Resource
    UserAccountService userAccountService;

    @RequestMapping("/login")
    @ResponseBody
    public Boolean login(@RequestBody JSONObject jsonParam){
        String userName = jsonParam.getString("userName");
        String password = jsonParam.getString("password");
        Boolean res = false;
        System.out.println("==================");
        System.out.println(userName.length());
        System.out.println(password);
        System.out.println("==================");
        UserAccount userAccount = userAccountService.loginByUserName(userName);
        if ( userAccount != null){
            if ( password.equals(userAccount.getUserPassword()) ){
                res = true;
            }
        }
        return res;
    }
}
