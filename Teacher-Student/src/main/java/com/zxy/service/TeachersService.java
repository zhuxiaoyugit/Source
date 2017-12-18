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

	public Teachers selectTeacherById(Integer id){
		return mapper.selectTeacherById(id);
	}
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
	
	public int deleteTeacherById(int id){
		return mapper.deleteTeacherById(id);
	}
	
	public int updateTeacher(Integer id,String teacherName,String teacherJob,Integer isExist,String comeDate,String outDate ){
		Teachers teachers = new Teachers();
		teachers.setId(id);
		teachers.setTeacherName(teacherName);
		teachers.setTeacherJob(teacherJob);
		teachers.setIsExist(isExist);
		teachers.setComeDate(comeDate);
		teachers.setOutDate(outDate);
		
		return mapper.updateTeacher(teachers);
	}
}
