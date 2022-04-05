package com.pandora.studyplatform.model;

import org.neo4j.ogm.annotation.*;


import java.io.Serializable;
import java.util.List;

/**
 * @author : Pandora
 * 2022/4/1-12:44
 * @description：
 */

@RelationshipEntity(type = "Next")
public class PointRelationship implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Point cur;

    @EndNode
    private Point sub;

    public PointRelationship() {
    }

    public PointRelationship(Long id, Point cur, Point sub) {
        this.id = id;
        this.cur = cur;
        this.sub = sub;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Point getCur() {
        return cur;
    }

    public void setCur(Point cur) {
        this.cur = cur;
    }

    public Point getSub() {
        return sub;
    }

    public void setSub(Point sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return "PointRelationship{" +
                "id=" + id +
                ", cur=" + cur +
                ", sub=" + sub +
                '}';
    }
}

