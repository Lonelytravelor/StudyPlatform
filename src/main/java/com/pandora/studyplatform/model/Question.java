package com.pandora.studyplatform.model;

public class Question {
    private Integer questionId;

    private String questionContent;

    private String questionStyle;

    private String questionAnswerA;

    private String questionAnswerB;

    private String questionAnswerC;

    private String questionAnswerD;

    private String questionAnswer;

    private String questionAnswerExplain;

    private String questionDifficultyLevel;

    private String questionPoint;

    private String questionSection;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getQuestionStyle() {
        return questionStyle;
    }

    public void setQuestionStyle(String questionStyle) {
        this.questionStyle = questionStyle;
    }

    public String getQuestionAnswerA() {
        return questionAnswerA;
    }

    public void setQuestionAnswerA(String questionAnswerA) {
        this.questionAnswerA = questionAnswerA;
    }

    public String getQuestionAnswerB() {
        return questionAnswerB;
    }

    public void setQuestionAnswerB(String questionAnswerB) {
        this.questionAnswerB = questionAnswerB;
    }

    public String getQuestionAnswerC() {
        return questionAnswerC;
    }

    public void setQuestionAnswerC(String questionAnswerC) {
        this.questionAnswerC = questionAnswerC;
    }

    public String getQuestionAnswerD() {
        return questionAnswerD;
    }

    public void setQuestionAnswerD(String questionAnswerD) {
        this.questionAnswerD = questionAnswerD;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionAnswerExplain() {
        return questionAnswerExplain;
    }

    public void setQuestionAnswerExplain(String questionAnswerExplain) {
        this.questionAnswerExplain = questionAnswerExplain;
    }

    public String getQuestionDifficultyLevel() {
        return questionDifficultyLevel;
    }

    public void setQuestionDifficultyLevel(String questionDifficultyLevel) {
        this.questionDifficultyLevel = questionDifficultyLevel;
    }

    public String getQuestionPoint() {
        return questionPoint;
    }

    public void setQuestionPoint(String questionPoint) {
        this.questionPoint = questionPoint;
    }

    public String getQuestionSection() {
        return questionSection;
    }

    public void setQuestionSection(String questionSection) {
        this.questionSection = questionSection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionId=").append(questionId);
        sb.append(", questionContent=").append(questionContent);
        sb.append(", questionStyle=").append(questionStyle);
        sb.append(", questionAnswerA=").append(questionAnswerA);
        sb.append(", questionAnswerB=").append(questionAnswerB);
        sb.append(", questionAnswerC=").append(questionAnswerC);
        sb.append(", questionAnswerD=").append(questionAnswerD);
        sb.append(", questionAnswer=").append(questionAnswer);
        sb.append(", questionAnswerExplain=").append(questionAnswerExplain);
        sb.append(", questionDifficultyLevel=").append(questionDifficultyLevel);
        sb.append(", questionPoint=").append(questionPoint);
        sb.append(", questionSection=").append(questionSection);
        sb.append("]");
        return sb.toString();
    }
}