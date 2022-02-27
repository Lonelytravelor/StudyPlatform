package com.pandora.studyplatform.mapper;
import org.apache.ibatis.annotations.Param;

import com.pandora.studyplatform.model.StudyStyle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudyStyleMapper {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(StudyStyle record);

    /**
     * select by primary key
     * @param styleId primary key
     * @return object by primary key
     */
    StudyStyle selectByPrimaryKey(Integer styleId);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(StudyStyle record);

    StudyStyle selectOneByStyleShape(@Param("styleShape")String styleShape);


}