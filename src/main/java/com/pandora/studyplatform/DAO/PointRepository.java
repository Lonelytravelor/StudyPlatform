package com.pandora.studyplatform.DAO;

import com.pandora.studyplatform.model.Point;
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
    @Query("MATCH (n:知识点 {name:$pointName}),(m:关系),(n2:知识点)\n" +
            "where n.name = m.sub and n2.name = m.obj\n" +
            "return n,m,n2")
    List<Point> findPrePointById(String pointName);


}
