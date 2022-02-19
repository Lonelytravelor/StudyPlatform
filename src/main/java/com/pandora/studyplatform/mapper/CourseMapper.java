package com.pandora.studyplatform.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.pandora.studyplatform.model.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Course record);

    /**
     * select by primary key
     * @param courseId primary key
     * @return object by primary key
     */
    Course selectByPrimaryKey(Integer courseId);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Course record);

    List<Course> selectAll();

    Course selectOneByCourseId(@Param("courseId")Integer courseId);

    List<Course> selectIndexCourse();


}