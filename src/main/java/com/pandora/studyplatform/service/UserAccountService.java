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

    
    public int deleteByPrimaryKey(String userId) {
        return userAccountMapper.deleteByPrimaryKey(userId);
    }

    
    public int insert(UserAccount record) {
        return userAccountMapper.insert(record);
    }

    
    public int insertSelective(UserAccount record) {
        return userAccountMapper.insertSelective(record);
    }

    
    public UserAccount selectByPrimaryKey(String userId) {
        return userAccountMapper.selectByPrimaryKey(userId);
    }

    
    public int updateByPrimaryKeySelective(UserAccount record) {
        return userAccountMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(UserAccount record) {
        return userAccountMapper.updateByPrimaryKey(record);
    }

	public List<UserAccount> selectAll(){
		 return userAccountMapper.selectAll();
	}

	public Integer countDistinctUserId(){
		 return userAccountMapper.countDistinctUserId();
	}

    public List<UserAccount> selectUsersPage(Integer pageNum, Integer pageSize){
        System.out.println("=====================================");
        List<UserAccount> userAccounts = userAccountMapper.findAllLimit(pageNum, pageSize);
        System.out.println(userAccounts);
        System.out.println("=====================================");
        return userAccounts;
    }


}
