package com.notbin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/index")
	public String Test(){
		return "index";
	}
	
	//测试提交111123
}
