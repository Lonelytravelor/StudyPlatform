package com.pandora.studyplatform.mapper;

import com.pandora.studyplatform.model.UserCourse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserCourseMapper {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserCourse record);

    /**
     * select by primary key
     * @param userid primary key
     * @return object by primary key
     */
    UserCourse selectByPrimaryKey(Integer userid);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserCourse record);
}