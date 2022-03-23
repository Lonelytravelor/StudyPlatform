package com.pandora.studyplatform.service;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.mapper.TestUserMapper;
import com.pandora.studyplatform.model.TestUser;
@Service
public class TestUserService{

    @Resource
    private TestUserMapper testUserMapper;

    
    public int insertSelective(TestUser record) {
        return testUserMapper.insertSelective(record);
    }

    
    public TestUser selectByPrimaryKey(Integer testId) {
        return testUserMapper.selectByPrimaryKey(testId);
    }

    
    public int updateByPrimaryKey(TestUser record) {
        return testUserMapper.updateByPrimaryKey(record);
    }

	public List<TestUser> selectAllByUserId(Integer userId){
		 return testUserMapper.selectAllByUserId(userId);
	}




}
