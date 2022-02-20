package com.pandora.studyplatform.service;
import java.util.List;
import com.pandora.studyplatform.model.NatureTest;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pandora.studyplatform.mapper.NatureTestMapper;
@Service
public class NatureTestService{

	public List<NatureTest> selectAll(){
		 return natureTestMapper.selectAll();
	}




    @Resource
    private NatureTestMapper natureTestMapper;

}
