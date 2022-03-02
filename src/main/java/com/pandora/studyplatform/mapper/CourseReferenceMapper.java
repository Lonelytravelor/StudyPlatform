package com.pandora.studyplatform.mapper;

import com.pandora.studyplatform.model.CourseReference;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseReferenceMapper {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CourseReference record);

    /**
     * select by primary key
     * @param referenceId primary key
     * @return object by primary key
     */
    CourseReference selectByPrimaryKey(Integer referenceId);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CourseReference record);
}