package com.pandora.studyplatform.mapper;
import org.apache.ibatis.annotations.Param;
import com.pandora.studyplatform.model.UserBasic;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBasicMapper {

    int insertSelective(UserBasic userBasic);

    UserBasic selectOneByUserId(@Param("userId")Integer userId);

    Integer selectOneUserStudyStelyIdByUserId(@Param("userId")Integer userId);

    int updateUserStudyStelyIdByUserId(@Param("updatedUserStudyStelyId")Integer updatedUserStudyStelyId,@Param("userId")Integer userId);




}