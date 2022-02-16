package com.pandora.studyplatform.service;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.model.UserAccount;
import com.pandora.studyplatform.mapper.UserAccountMapper;
@Service
public class UserAccountService{

    @Resource
    private UserAccountMapper userAccountMapper;

    
    public int deleteByPrimaryKey(Integer userId) {
        return userAccountMapper.deleteByPrimaryKey(userId);
    }

    
    public int insert(UserAccount record) {
        return userAccountMapper.insert(record);
    }

    
    public int insertSelective(UserAccount record) {
        return userAccountMapper.insertSelective(record);
    }

    public Boolean register(UserAccount record) {
//        基于insertSelective（）方法进行重写，实现注册成功返回true
        Boolean res;
        int i = userAccountMapper.insertSelective(record);
        res = ( i != 0 );
        return res;
    }

    
    public UserAccount selectByPrimaryKey(Integer userId) {
        return userAccountMapper.selectByPrimaryKey(userId);
    }

    
    public int updateByPrimaryKeySelective(UserAccount record) {
        return userAccountMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(UserAccount record) {
        return userAccountMapper.updateByPrimaryKey(record);
    }

	public UserAccount loginByUserName(String userName){
        UserAccount userAccount = userAccountMapper.selectOneByUserPhone(userName);
        if ( userAccount == null){
            userAccount = userAccountMapper.selectOneByUserEmail(userName);
        }
        return userAccount;
	}







}
