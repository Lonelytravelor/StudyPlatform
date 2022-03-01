package com.pandora.studyplatform.mapper;
import com.pandora.studyplatform.model.StudyStyle;
import org.apache.ibatis.annotations.*;
import com.pandora.studyplatform.model.UserBasic;

@Mapper
public interface UserBasicMapper {

    int insertSelective(UserBasic userBasic);

    UserBasic selectOneByUserId(@Param("userId")Integer userId);

    Integer selectOneUserStudyStelyIdByUserId(@Param("userId")Integer userId);

    int updateUserStudyStelyIdByUserId(@Param("updatedUserStudyStelyId")Integer updatedUserStudyStelyId,@Param("userId")Integer userId);

    @Select("select * from user_basic where user_id = #{id}")
    @Results({
            @Result(column = "user_id", property = "userId"),
            @Result(column = "user_age", property = "userAge"),
            @Result(column = "user_gender", property = "userGender"),
            @Result(column = "user_college", property = "userCollege"),
            @Result(column = "user_discipline", property = "userDiscipline"),
            @Result(column = "user_class", property = "userClass"),
            @Result(column = "user_school_year", property = "userSchoolYear"),
            @Result(column = "user_last_login_time", property = "userLastLoginTime"),
            @Result(column = "user_registration_time", property = "userRegistrationTime"),
            @Result(column = "user_study_stely_id", property = "userStudyStelyId"),
            @Result(
                    column = "user_study_stely_id",
                    property = "studyStyle",
                    javaType = StudyStyle.class,
                    one = @One(select = "com.pandora.studyplatform.mapper.StudyStyleMapper.selectByPrimaryKey")
            )
    })
    UserBasic selectOneStudyStelyByUserId(Integer id);

}