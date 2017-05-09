package com.theta.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		//ModelAndView mv = new ModelAndView("login/login");
		System.out.println("...");
		return "hello, world! It comes from spring-mvc!";
	}
}
