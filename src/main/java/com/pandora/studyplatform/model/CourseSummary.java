package com.pandora.studyplatform.model;

public class CourseSummary {
    private Integer summaryId;

    private String summaryContent;

    public Integer getSummaryId() {
        return summaryId;
    }

    public void setSummaryId(Integer summaryId) {
        this.summaryId = summaryId;
    }

    public String getSummaryContent() {
        return summaryContent;
    }

    public void setSummaryContent(String summaryContent) {
        this.summaryContent = summaryContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", summaryId=").append(summaryId);
        sb.append(", summaryContent=").append(summaryContent);
        sb.append("]");
        return sb.toString();
    }
}