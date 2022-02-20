package com.pandora.studyplatform.model;

import java.time.LocalDateTime;

public class Course {
    private Integer courseId;

    private String courseName;

    private String courseTeacher;

    private String courseLabel;

    private String courseInstitution;

    private String courseAnnouncementId;

    private String courseReferenceId;

    private LocalDateTime courseReleaseTime;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseLabel() {
        return courseLabel;
    }

    public void setCourseLabel(String courseLabel) {
        this.courseLabel = courseLabel;
    }

    public String getCourseInstitution() {
        return courseInstitution;
    }

    public void setCourseInstitution(String courseInstitution) {
        this.courseInstitution = courseInstitution;
    }

    public String getCourseAnnouncementId() {
        return courseAnnouncementId;
    }

    public void setCourseAnnouncementId(String courseAnnouncementId) {
        this.courseAnnouncementId = courseAnnouncementId;
    }

    public String getCourseReferenceId() {
        return courseReferenceId;
    }

    public void setCourseReferenceId(String courseReferenceId) {
        this.courseReferenceId = courseReferenceId;
    }

    public LocalDateTime getCourseReleaseTime() {
        return courseReleaseTime;
    }

    public void setCourseReleaseTime(LocalDateTime courseReleaseTime) {
        this.courseReleaseTime = courseReleaseTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseId=").append(courseId);
        sb.append(", courseName=").append(courseName);
        sb.append(", courseTeacher=").append(courseTeacher);
        sb.append(", courseLabel=").append(courseLabel);
        sb.append(", courseInstitution=").append(courseInstitution);
        sb.append(", courseAnnouncementId=").append(courseAnnouncementId);
        sb.append(", courseReferenceId=").append(courseReferenceId);
        sb.append(", courseReleaseTime=").append(courseReleaseTime);
        sb.append("]");
        return sb.toString();
    }
}