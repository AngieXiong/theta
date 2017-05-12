package com.theta.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

	@RequestMapping("/hello")
	@ResponseBody
	public ModelAndView hello(){
		ModelAndView mv = new ModelAndView("login/login");
		//return "hello, world! It comes from spring-mvc!";
		return mv;
	}
}
