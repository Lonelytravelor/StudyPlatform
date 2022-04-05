package com.pandora.studyplatform.model;


import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author : Pandora
 * 2022/4/1-12:13
 * @description：
 */

@NodeEntity(label = "Point")
public class Point implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property
    private String name;
    @Property
    private String file;
    @Property
    private String video;
    @Property
    private String type;

    private List<Point> nextPoints;

    private List<String> videoList;

    private List<String> fileList;

    public Point() {
    }

    public Point(Long id, String name, String file, String video, String type) {
        this.id = id;
        this.name = name;
        this.file = file;
        this.video = video;
        this.type = type;
    }

    public List<String> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<String> videoList) {
        this.videoList = videoList;
    }

    public List<String> getFileList() {
        return fileList;
    }

    public void setFileList(List<String> fileList) {
        this.fileList = fileList;
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

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Point> getNextPoints() {
        return nextPoints;
    }

    public void setNextPoints(List<Point> nextPoints) {
        this.nextPoints = nextPoints;
    }

    @Override
    public String toString() {
        return "Point{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", file='" + file + '\'' +
                ", video='" + video + '\'' +
                ", type='" + type + '\'' +
                ", nextPoints=" + nextPoints +
                '}';
    }
}


