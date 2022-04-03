package com.pandora.studyplatform.mapper;

import com.pandora.studyplatform.model.CoursePoint;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoursePointMapper {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CoursePoint record);

    /**
     * select by primary key
     * @param courseId primary key
     * @return object by primary key
     */
    CoursePoint selectByPrimaryKey(Integer courseId);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CoursePoint record);
}