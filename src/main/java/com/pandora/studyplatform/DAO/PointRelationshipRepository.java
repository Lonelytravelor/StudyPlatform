package com.pandora.studyplatform.DAO;


import com.pandora.studyplatform.model.Point;
import com.pandora.studyplatform.model.PointRelationship;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PointRelationshipRepository extends Neo4jRepository<PointRelationship,Long>{


}
