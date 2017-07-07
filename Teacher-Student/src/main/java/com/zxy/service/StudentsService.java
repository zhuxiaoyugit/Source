package com.zxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxy.dao.StudentsMapper;
import com.zxy.domain.Students;

@Service
public class StudentsService {

	@Autowired
	private StudentsMapper mapper;
	
	public List<Students> selectAllStudent(){
		return mapper.selectAllStudent();
	}
}
