package com.pandora.studyplatform.mapper;
import org.apache.ibatis.annotations.Param;

import com.pandora.studyplatform.model.UserAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserAccountMapper {
    /**
     * delete by primary key
     * @param userId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(UserAccount record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserAccount record);

    /**
     * select by primary key
     * @param userId primary key
     * @return object by primary key
     */
    UserAccount selectByPrimaryKey(Integer userId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserAccount record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserAccount record);

    UserAccount selectOneByUserPhone(@Param("userPhone")String userPhone);

    UserAccount selectOneByUserEmail(@Param("userEmail")String userEmail);


}