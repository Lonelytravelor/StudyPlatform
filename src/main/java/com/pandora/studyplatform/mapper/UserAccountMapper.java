package com.pandora.studyplatform.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.pandora.studyplatform.model.UserAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserAccountMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);

    List<UserAccount> selectAll();


}