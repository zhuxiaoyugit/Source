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
}
