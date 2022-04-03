package com.pandora.studyplatform.model;

import org.neo4j.ogm.annotation.*;


import java.io.Serializable;
import java.util.List;

/**
 * @author : Pandora
 * 2022/4/1-12:44
 * @description：
 */

@RelationshipEntity(type = "先序知识")
public class PointRelationship implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Point sub;

    @EndNode
    private Point obj;

    public PointRelationship() {
    }

    public PointRelationship(Long id, Point obj, Point sub) {
        this.id = id;
        this.obj = obj;
        this.sub = sub;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Point getObj() {
        return obj;
    }

    public void setObj(Point obj) {
        this.obj = obj;
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
                ", obj=" + obj +
                ", sub=" + sub +
                '}';
    }
}

