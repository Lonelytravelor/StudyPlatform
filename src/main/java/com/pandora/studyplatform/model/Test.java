package com.pandora.studyplatform.model;

import java.time.LocalDateTime;
import java.util.List;

public class Test {
    private Integer testId;

    private String testTitle;

    private LocalDateTime testTime;

    private Integer testNum;

    private String testQuestionList;

    private transient List<Question> questionList;

    private String testAnswerList;

    private transient List<String> answerList;

    private String testState;

    private String testScore;

    public Test() {
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public List<String> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<String> answerList) {
        this.answerList = answerList;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getTestTitle() {
        return testTitle;
    }

    public void setTestTitle(String testTitle) {
        this.testTitle = testTitle;
    }

    public LocalDateTime getTestTime() {
        return testTime;
    }

    public void setTestTime(LocalDateTime testTime) {
        this.testTime = testTime;
    }

    public Integer getTestNum() {
        return testNum;
    }

    public void setTestNum(Integer testNum) {
        this.testNum = testNum;
    }

    public String getTestQuestionList() {
        return testQuestionList;
    }

    public void setTestQuestionList(String testQuestionList) {
        this.testQuestionList = testQuestionList;
    }

    public String getTestAnswerList() {
        return testAnswerList;
    }

    public void setTestAnswerList(String testAnswerList) {
        this.testAnswerList = testAnswerList;
    }

    public String getTestState() {
        return testState;
    }

    public void setTestState(String testState) {
        this.testState = testState;
    }

    public String getTestScore() {
        return testScore;
    }

    public void setTestScore(String testScore) {
        this.testScore = testScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", testId=").append(testId);
        sb.append(", testTitle=").append(testTitle);
        sb.append(", testTime=").append(testTime);
        sb.append(", testNum=").append(testNum);
        sb.append(", testQuestionList=").append(testQuestionList);
        sb.append(", testAnswerList=").append(testAnswerList);
        sb.append(", testState=").append(testState);
        sb.append(", testScore=").append(testScore);
        sb.append("]");
        return sb.toString();
    }
}