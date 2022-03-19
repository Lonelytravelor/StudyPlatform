package com.pandora.studyplatform.model;

public class TestUser {
    private Integer testId;

    private Integer userId;

    public TestUser(Integer testId, Integer userId) {
        this.testId = testId;
        this.userId = userId;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", testId=").append(testId);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}