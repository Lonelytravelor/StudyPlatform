package com.pandora.studyplatform.model;

public class NatureTest {
    private Integer natureTestId;

    private String natureTest;

    private String optionA;

    private String optionB;

    public Integer getNatureTestId() {
        return natureTestId;
    }

    public void setNatureTestId(Integer natureTestId) {
        this.natureTestId = natureTestId;
    }

    public String getNatureTest() {
        return natureTest;
    }

    public void setNatureTest(String natureTest) {
        this.natureTest = natureTest;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", natureTestId=").append(natureTestId);
        sb.append(", natureTest=").append(natureTest);
        sb.append(", optionA=").append(optionA);
        sb.append(", optionB=").append(optionB);
        sb.append("]");
        return sb.toString();
    }
}