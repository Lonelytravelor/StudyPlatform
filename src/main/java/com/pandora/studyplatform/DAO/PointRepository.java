package com.pandora.studyplatform.DAO;

import com.pandora.studyplatform.model.Point;
import com.pandora.studyplatform.model.PointTest;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Pandora
 * 2022/4/1-12:12
 * @description：
 */

@Repository
public interface PointRepository extends Neo4jRepository<Point,Long> {
    @Query("MATCH (n:Point {name:$pointName})-[m:Next]->(n2:Point)\n" +
            "where n.name = m.cur and n2.name = m.sub\n" +
            "return n2")
    List<Point> findSubPointById(String pointName);

    @Query("MATCH (n:Point {name:$pointName})-[m:Next]->(n2:Point)\n" +
            "where n.name = m.sub and n2.name = m.cur\n" +
            "return n2")
    List<Point> findPrePointById(String pointName);
}
