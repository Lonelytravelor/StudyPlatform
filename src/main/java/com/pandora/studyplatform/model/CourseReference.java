package com.pandora.studyplatform.model;

public class CourseReference {
    private Integer referenceId;

    private String referenceName;

    private String referenceAuthor;

    private String referencePress;

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public String getReferenceAuthor() {
        return referenceAuthor;
    }

    public void setReferenceAuthor(String referenceAuthor) {
        this.referenceAuthor = referenceAuthor;
    }

    public String getReferencePress() {
        return referencePress;
    }

    public void setReferencePress(String referencePress) {
        this.referencePress = referencePress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", referenceId=").append(referenceId);
        sb.append(", referenceName=").append(referenceName);
        sb.append(", referenceAuthor=").append(referenceAuthor);
        sb.append(", referencePress=").append(referencePress);
        sb.append("]");
        return sb.toString();
    }
}