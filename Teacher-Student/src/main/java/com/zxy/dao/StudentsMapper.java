package com.zxy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zxy.domain.Students;

@Repository
public interface StudentsMapper {
	List<Students> selectAllStudent();

}
