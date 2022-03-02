package com.pandora.studyplatform.mapper;

import com.pandora.studyplatform.model.CourseAnnouncement;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseAnnouncementMapper {
    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CourseAnnouncement record);

    /**
     * select by primary key
     * @param announcementId primary key
     * @return object by primary key
     */
    CourseAnnouncement selectByPrimaryKey(Integer announcementId);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CourseAnnouncement record);
}