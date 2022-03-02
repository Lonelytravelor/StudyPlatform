package com.pandora.studyplatform.model;

import java.time.LocalDateTime;
import java.util.List;

public class Course {
    private Integer courseId;

    private String courseName;

    private Integer courseSummaryId;

    private transient CourseSummary courseSummary;

    private String courseImageUrl;

    private String courseTeacher;

    private String courseLabel;

    private String courseInstitution;

    private String courseAnnouncementId;

    private transient List<CourseAnnouncement> courseAnnouncementList;

    private String courseReferenceId;

    private transient List<CourseReference> courseReferenceList;

    private LocalDateTime courseReleaseTime;

    private Integer courseSelected;

    public Course() {
    }

    public CourseSummary getCourseSummary() {
        return courseSummary;
    }

    public void setCourseSummary(CourseSummary courseSummary) {
        this.courseSummary = courseSummary;
    }

    public List<CourseAnnouncement> getCourseAnnouncementList() {
        return courseAnnouncementList;
    }

    public void setCourseAnnouncementList(List<CourseAnnouncement> courseAnnouncementList) {
        this.courseAnnouncementList = courseAnnouncementList;
    }

    public List<CourseReference> getCourseReferenceList() {
        return courseReferenceList;
    }

    public void setCourseReferenceList(List<CourseReference> courseReferenceList) {
        this.courseReferenceList = courseReferenceList;
    }

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

    public Integer getCourseSummaryId() {
        return courseSummaryId;
    }

    public void setCourseSummaryId(Integer courseSummaryId) {
        this.courseSummaryId = courseSummaryId;
    }

    public String getCourseImageUrl() {
        return courseImageUrl;
    }

    public void setCourseImageUrl(String courseImageUrl) {
        this.courseImageUrl = courseImageUrl;
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

    public Integer getCourseSelected() {
        return courseSelected;
    }

    public void setCourseSelected(Integer courseSelected) {
        this.courseSelected = courseSelected;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseId=").append(courseId);
        sb.append(", courseName=").append(courseName);
        sb.append(", courseSummaryId=").append(courseSummaryId);
        sb.append(", courseImageUrl=").append(courseImageUrl);
        sb.append(", courseTeacher=").append(courseTeacher);
        sb.append(", courseLabel=").append(courseLabel);
        sb.append(", courseInstitution=").append(courseInstitution);
        sb.append(", courseAnnouncementId=").append(courseAnnouncementId);
        sb.append(", courseReferenceId=").append(courseReferenceId);
        sb.append(", courseReleaseTime=").append(courseReleaseTime);
        sb.append(", courseSelected=").append(courseSelected);
        sb.append("]");
        return sb.toString();
    }
}