package com.zxy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zxy.domain.Teachers;
@Repository
public interface TeachersMapper {
	List<Teachers> selectAllTeachers();
	
	int selectCount();
	
	int addTeacher(Teachers teachers);
}
