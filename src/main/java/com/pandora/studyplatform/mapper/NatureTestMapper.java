package com.pandora.studyplatform.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.pandora.studyplatform.model.NatureTest;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NatureTestMapper {
    List<NatureTest> selectAll();


}