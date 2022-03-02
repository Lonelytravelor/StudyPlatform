package com.pandora.studyplatform.model;

import java.time.LocalDateTime;

public class CourseAnnouncement {
    private Integer announcementId;

    private String announcementTitle;

    private String announcementContent;

    private LocalDateTime announcementTime;

    public Integer getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Integer announcementId) {
        this.announcementId = announcementId;
    }

    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
    }

    public String getAnnouncementContent() {
        return announcementContent;
    }

    public void setAnnouncementContent(String announcementContent) {
        this.announcementContent = announcementContent;
    }

    public LocalDateTime getAnnouncementTime() {
        return announcementTime;
    }

    public void setAnnouncementTime(LocalDateTime announcementTime) {
        this.announcementTime = announcementTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", announcementId=").append(announcementId);
        sb.append(", announcementTitle=").append(announcementTitle);
        sb.append(", announcementContent=").append(announcementContent);
        sb.append(", announcementTime=").append(announcementTime);
        sb.append("]");
        return sb.toString();
    }
}