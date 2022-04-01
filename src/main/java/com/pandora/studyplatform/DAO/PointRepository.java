package com.pandora.studyplatform.DAO;

import com.pandora.studyplatform.model.Point;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Pandora
 * 2022/4/1-12:12
 * @description：
 */

@Repository
public interface PointRepository extends Neo4jRepository<Point,Long> {

}
