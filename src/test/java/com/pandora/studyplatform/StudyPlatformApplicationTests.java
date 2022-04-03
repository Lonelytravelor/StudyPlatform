package com.pandora.studyplatform;

import com.pandora.studyplatform.DAO.PointRelationshipRepository;
import com.pandora.studyplatform.DAO.PointRepository;
import com.pandora.studyplatform.model.Point;
import com.pandora.studyplatform.model.PointRelationship;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class StudyPlatformApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    PointRepository pointRepository;
    @Resource
    PointRelationshipRepository pointRelationshipRepository;

    @Test
    public void test(){
//        Optional<Point> byId = pointRepository.findById(17L);
//        System.out.println("=================================================================================");
//        System.out.println(byId);
//        Point point1 = new Point(1000L, "玉皇大帝", "", "");
//        Point point2 = new Point(1001L, "王母娘娘", "", "");
//        pointRepository.save(point1);
//        pointRepository.save(point2);
//        PointRelationship relationship = new PointRelationship();
//        relationship.setId(1000L);
//        relationship.setObj(point1);
//        relationship.setSub(point2);
//        pointRelationshipRepository.save(relationship);
//        Optional<Point> byId = pointRepository.findById(1000L);
//        System.out.println(byId);
        List<Point> pointByName = pointRepository.findPrePointById("推理定律");
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("====================");
        for (Point p : pointByName) {
            System.out.println(p);
        }
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("====================");
        pointByName = pointRepository.findSubPointById("推理定律");
        for (Point p : pointByName) {
            System.out.println(p);
        }
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("====================");
    }

}
