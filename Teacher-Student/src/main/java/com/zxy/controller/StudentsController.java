package com.zxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxy.domain.Students;
import com.zxy.domain.Teachers;
import com.zxy.service.StudentsService;
import com.zxy.service.TeachersService;

@Controller
@RequestMapping(value="/students")
public class StudentsController {
	
	@Autowired
	StudentsService studentsService;
	@Autowired
	TeachersService teachersService;
	
	@RequestMapping("/studentList")
	public ModelAndView studentList(String str,String beginDate,String endDate) {
		ModelAndView modelAndView= new ModelAndView("student-list");
		List<Students> studentList=studentsService.selectAllStudent(str, beginDate, endDate);
		int count=studentsService.selectCount(str, beginDate, endDate);
		modelAndView.addObject("studentList", studentList);
		modelAndView.addObject("num", count);
		modelAndView.addObject("str", str);
		modelAndView.addObject("beginDate", beginDate);
		modelAndView.addObject("endDate", endDate);
		
		return modelAndView;
	}
	
}
