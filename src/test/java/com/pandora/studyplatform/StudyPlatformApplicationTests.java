package com.pandora.studyplatform;

import com.pandora.studyplatform.DAO.PointRepository;
import com.pandora.studyplatform.model.Point;
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

    @Test
    public void test(){
        Optional<Point> byId = pointRepository.findById(17L);
        List<Point> all = pointRepository.findAll();
        System.out.println("=================================================================================");
        System.out.println(byId);
        System.out.println(all);

        Point point = new Point(1000L, "yuhuandadi", "", "");
        pointRepository.save(point);
    }

}
