package com.zxy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxy.domain.Students;
import com.zxy.domain.Teachers;
import com.zxy.service.StudentsService;
import com.zxy.service.TeachersService;

@Controller
@RequestMapping("/total")
public class TotalController {
	@Resource
	private TeachersService teachersService;
	@Autowired
	private StudentsService studentsService;

	@RequestMapping("/index")
	public ModelAndView getIndex() {
		ModelAndView maView = new ModelAndView("allTable");
		List<Teachers> teacherList = teachersService.selectAllTeachers(null,null,null);
		List<Students> studentList = studentsService.selectAllStudent(null,null,null);
		maView.addObject("teacherList", teacherList);
		maView.addObject("studentList", studentList);
		return maView;
	}
}
