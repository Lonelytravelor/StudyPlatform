package com.pandora.studyplatform.service;
import java.util.List;
import com.pandora.studyplatform.model.UserBasic;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.mapper.UserBasicMapper;
@Service
public class UserBasicService{
	@Resource
	private UserBasicMapper userBasicMapper;

	public Boolean insertSelective(UserBasic userBasic){
		int i = userBasicMapper.insertSelective(userBasic);
		if ( i == 1 ){
			return true;
		}
		return false;
	}

	public UserBasic selectOneByUserId(Integer userId){
		 return userBasicMapper.selectOneByUserId(userId);
	}





}
