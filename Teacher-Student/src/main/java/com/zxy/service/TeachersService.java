package com.zxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxy.dao.TeachersMapper;
import com.zxy.domain.Teachers;

@Service
public class TeachersService {
	@Autowired
	private TeachersMapper mapper;

	public List<Teachers> selectAllTeachers() {
		return mapper.selectAllTeachers();
	};
	
	public int selectCount(){
		return mapper.selectCount();
	}
	
	public int addTeacher(String name,String job){
		Teachers teachers= new Teachers();
		teachers.setTeacherName(name);
		teachers.setTeacherJob(job);
		
		return mapper.addTeacher(teachers);
	}
}
