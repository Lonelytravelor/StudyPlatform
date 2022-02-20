package com.pandora.studyplatform.mapper;
import com.pandora.studyplatform.model.UserBasic;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBasicMapper {

    int insertSelective(UserBasic userBasic);


}