package com.pandora.studyplatform.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.model.CourseAnnouncement;
import com.pandora.studyplatform.mapper.CourseAnnouncementMapper;
@Service
public class CourseAnnouncementService{

    @Resource
    private CourseAnnouncementMapper courseAnnouncementMapper;

    
    public int insertSelective(CourseAnnouncement record) {
        return courseAnnouncementMapper.insertSelective(record);
    }

    
    public CourseAnnouncement selectByPrimaryKey(Integer announcementId) {
        return courseAnnouncementMapper.selectByPrimaryKey(announcementId);
    }

    
    public int updateByPrimaryKey(CourseAnnouncement record) {
        return courseAnnouncementMapper.updateByPrimaryKey(record);
    }

}
