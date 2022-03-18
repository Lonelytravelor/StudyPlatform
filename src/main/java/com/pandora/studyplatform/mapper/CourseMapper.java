package com.pandora.studyplatform.mapper;

import com.pandora.studyplatform.model.Course;
import org.apache.ibatis.annotations.Mapper;import org.apache.ibatis.annotations.Param;import java.util.List;

@Mapper
public interface CourseMapper {
    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Course record);

    /**
     * select by primary key
     *
     * @param courseId primary key
     * @return object by primary key
     */
    Course selectByPrimaryKey(Integer courseId);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Course record);

    List<Course> selectAll();

    Course selectOneByCourseId(@Param("courseId") Integer courseId);

    List<Course> selectIndexCourse();

    List<Course> selectAllByCourseLabel(@Param("courseLabel") String courseLabel);

    List<Course> selectAllByCourseLabelLimit(@Param("courseLabel") String courseLabel);

    List<Course> selectByCourseNameLike(@Param("likeCourseName") String likeCourseName);

    List<String> selectCourseUniversity();

    List<Course> selectAllByCourseUniversityLimit(@Param("courseUniversity") String courseUniversity);

    List<Course> selectAllByCourseUniversity(@Param("courseUniversity")String courseUniversity);



}