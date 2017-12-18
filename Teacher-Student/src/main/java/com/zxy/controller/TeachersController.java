package com.zxy.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zxy.domain.Teachers;
import com.zxy.service.TeachersService;


@Controller
@RequestMapping(value="/teachers")
public class TeachersController {
	public static final Logger logger=LoggerFactory.getLogger(TeachersController.class);
	@Autowired
	private TeachersService service;
	
	@RequestMapping("/teacherList")
	public ModelAndView teacherList(){
		ModelAndView modelAndView= new ModelAndView("teacher-list");
		List<Teachers> list = service.selectAllTeachers();
		modelAndView.addObject("teacherList", list);
		int count =service.selectCount();
		modelAndView.addObject("num", count);
		return modelAndView;
	}
	
	@RequestMapping(value="/addTeacher" )
	public String doAddTeacher(String name,String job){
		if (StringUtils.isEmpty(name)&&StringUtils.isEmpty(job)) {
			return "member-add";
		}else{
			try {
				int num=service.addTeacher(name, job);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
				logger.error("TeachersController addTeacher error"+e.getMessage());
				return "error";
			}
			return "success";
		}
	}
}
