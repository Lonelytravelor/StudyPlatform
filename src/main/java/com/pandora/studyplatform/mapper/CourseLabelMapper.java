package com.pandora.studyplatform.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.pandora.studyplatform.model.CourseLabel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseLabelMapper {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CourseLabel record);

    /**
     * select by primary key
     * @param labelId primary key
     * @return object by primary key
     */
    CourseLabel selectByPrimaryKey(Integer labelId);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CourseLabel record);

    List<CourseLabel> selectAll();
}