package com.pandora.studyplatform.model;


import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Pandora
 * 2022/4/1-12:13
 * @description：
 */

@NodeEntity(label = "知识点")
public class PointTest implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property
    private String name;
    @Property
    private String files;
    @Property
    private String videos;

    private List<PointTest> nextPoints;

    public PointTest() {
    }

    public PointTest(Long id, String name, String files, String videos) {
        this.id = id;
        this.name = name;
        this.files = files;
        this.videos = videos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }

    public List<PointTest> getNextPoints() {
        return nextPoints;
    }

    public void setNextPoints(List<PointTest> nextPoints) {
        this.nextPoints = nextPoints;
    }

    @Override
    public String toString() {
        return "PointTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", files='" + files + '\'' +
                ", videos='" + videos + '\'' +
                ", nextPoints=" + nextPoints +
                '}';
    }
}


