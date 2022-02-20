package com.pandora.studyplatform.model;

import java.time.LocalDateTime;

public class UserBasic {
    private Integer userId;

    private String userAge;

    private String userGender;

    private String userCollege;

    private String userDiscipline;

    private String userClass;

    private String userSchoolYear;

    private LocalDateTime userLastLoginTime;

    private LocalDateTime userRegistrationTime;

    private Integer userStudyStelyId;

    public UserBasic(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserCollege() {
        return userCollege;
    }

    public void setUserCollege(String userCollege) {
        this.userCollege = userCollege;
    }

    public String getUserDiscipline() {
        return userDiscipline;
    }

    public void setUserDiscipline(String userDiscipline) {
        this.userDiscipline = userDiscipline;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public String getUserSchoolYear() {
        return userSchoolYear;
    }

    public void setUserSchoolYear(String userSchoolYear) {
        this.userSchoolYear = userSchoolYear;
    }

    public LocalDateTime getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(LocalDateTime userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public LocalDateTime getUserRegistrationTime() {
        return userRegistrationTime;
    }

    public void setUserRegistrationTime(LocalDateTime userRegistrationTime) {
        this.userRegistrationTime = userRegistrationTime;
    }

    public Integer getUserStudyStelyId() {
        return userStudyStelyId;
    }

    public void setUserStudyStelyId(Integer userStudyStelyId) {
        this.userStudyStelyId = userStudyStelyId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userAge=").append(userAge);
        sb.append(", userGender=").append(userGender);
        sb.append(", userCollege=").append(userCollege);
        sb.append(", userDiscipline=").append(userDiscipline);
        sb.append(", userClass=").append(userClass);
        sb.append(", userSchoolYear=").append(userSchoolYear);
        sb.append(", userLastLoginTime=").append(userLastLoginTime);
        sb.append(", userRegistrationTime=").append(userRegistrationTime);
        sb.append(", userStudyStelyId=").append(userStudyStelyId);
        sb.append("]");
        return sb.toString();
    }
}