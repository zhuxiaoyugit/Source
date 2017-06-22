package com.yibai.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController
{
	@RequestMapping("/user")
	public String userInfo(Model model,@RequestParam(value="name",defaultValue="Guest")String name){
		model.addAttribute("name",name);
		if ("admin".equals(name))
		{
			model.addAttribute("email","admin@ybai.com");
		}else{
			model.addAttribute("email","Not set");
		}
		
		return "userInfo";
	}
}
