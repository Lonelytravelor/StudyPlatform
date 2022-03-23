package com.pandora.studyplatform.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.pandora.studyplatform.model.TestUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestUserMapper {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TestUser record);

    /**
     * select by primary key
     * @param testId primary key
     * @return object by primary key
     */
    TestUser selectByPrimaryKey(Integer testId);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TestUser record);

    List<TestUser> selectAllByUserId(@Param("userId")Integer userId);


}