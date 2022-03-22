package com.pandora.studyplatform.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import java.time.LocalDateTime;

import com.pandora.studyplatform.model.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Test record);

    /**
     * select by primary key
     * @param testId primary key
     * @return object by primary key
     */
    Test selectByPrimaryKey(Integer testId);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Test record);

    Test selectOneByTestTime(@Param("testTime")LocalDateTime testTime);

    Integer selectOneTestIdByTestTime(@Param("testTime")LocalDateTime testTime);

    Integer selectOneTestId();

    int updateTestScoreAndTestAnswerListAndTestStateByTestId(@Param("updatedTestScore")String updatedTestScore,@Param("updatedTestAnswerList")String updatedTestAnswerList,@Param("updatedTestState")String updatedTestState,@Param("testId")Integer testId);


}