package com.pandora.studyplatform.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.model.UserCourse;
import com.pandora.studyplatform.mapper.UserCourseMapper;
@Service
public class UserCourseService{

    @Resource
    private UserCourseMapper userCourseMapper;

    
    public Boolean insertSelective(UserCourse record) {
        int i = userCourseMapper.insertSelective(record);
        if ( i == 1 ){
            return true;
        }
        return false;
    }

    
    public UserCourse selectByPrimaryKey(Integer userid) {
        return userCourseMapper.selectByPrimaryKey(userid);
    }

    
    public int updateByPrimaryKey(UserCourse record) {
        return userCourseMapper.updateByPrimaryKey(record);
    }

}
