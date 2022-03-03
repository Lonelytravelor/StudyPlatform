package com.pandora.studyplatform.model;

public class UserCourse {
    private Integer userid;

    private String coursesId;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(String coursesId) {
        this.coursesId = coursesId;
    }

    public UserCourse() {
    }

    public UserCourse(Integer userid) {
        this.userid = userid;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", coursesId=").append(coursesId);
        sb.append("]");
        return sb.toString();
    }
}