package com.pandora.studyplatform.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.pandora.studyplatform.model.Question;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Question record);

    /**
     * select by primary key
     * @param questionId primary key
     * @return object by primary key
     */
    Question selectByPrimaryKey(Integer questionId);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Question record);

    List<Question> selectAll();

    List<Question> selectAllByQuestionSectionLike(@Param("likeQuestionSection")String likeQuestionSection);

    List<Question> selectAllByQuestionStyleMultipleAndQuestionSectionLike(@Param("likeQuestionSection")String likeQuestionSection);

    List<Question> selectAllByQuestionStyleSingleAndQuestionSectionLike(@Param("likeQuestionSection")String likeQuestionSection);

    List<Question> selectAllByQuestionStyleJudgeAndQuestionSectionLike(@Param("likeQuestionSection")String likeQuestionSection);





}