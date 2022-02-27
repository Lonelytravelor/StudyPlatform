package com.pandora.studyplatform.model;

public class StudyStyle {
    private Integer styleId;

    private String styleShape;

    private String styleName;

    private String styleDes;

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    public String getStyleShape() {
        return styleShape;
    }

    public void setStyleShape(String styleShape) {
        this.styleShape = styleShape;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getStyleDes() {
        return styleDes;
    }

    public void setStyleDes(String styleDes) {
        this.styleDes = styleDes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", styleId=").append(styleId);
        sb.append(", styleShape=").append(styleShape);
        sb.append(", styleName=").append(styleName);
        sb.append(", styleDes=").append(styleDes);
        sb.append("]");
        return sb.toString();
    }
}