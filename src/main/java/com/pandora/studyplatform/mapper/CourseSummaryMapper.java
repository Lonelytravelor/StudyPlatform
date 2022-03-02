package com.pandora.studyplatform.mapper;

import com.pandora.studyplatform.model.CourseSummary;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseSummaryMapper {
    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(CourseSummary record);

    /**
     * select by primary key
     *
     * @param summaryId primary key
     * @return object by primary key
     */
    CourseSummary selectByPrimaryKey(Integer summaryId);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CourseSummary record);
}