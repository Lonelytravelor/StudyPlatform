package com.pandora.studyplatform.service;
import java.time.LocalDateTime;
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
		 return userBasicMapper.selectOneStudyStelyByUserId(userId);
	}

	public Integer selectOneUserStudyStelyIdByUserId(Integer userId){
		 return userBasicMapper.selectOneUserStudyStelyIdByUserId(userId);
	}

	public int updateUserStudyStelyIdByUserId(Integer updatedUserStudyStelyId,Integer userId){
		 return userBasicMapper.updateUserStudyStelyIdByUserId(updatedUserStudyStelyId,userId);
	}

	public int updateByUserId(UserBasic updated,Integer userId){
		 return userBasicMapper.updateByUserId(updated,userId);
	}

	public int updateUserLastLoginTimeByUserId(LocalDateTime updatedUserLastLoginTime,Integer userId){
		 return userBasicMapper.updateUserLastLoginTimeByUserId(updatedUserLastLoginTime,userId);
	}














}
