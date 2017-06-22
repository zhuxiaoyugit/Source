package com.yibai.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectController
{
	@RequestMapping(value="/redirect",method=RequestMethod.GET)
	public String redi(Model model){
		model.addAttribute("greeting","null");
		return "redirect:/hello";
	}
}
