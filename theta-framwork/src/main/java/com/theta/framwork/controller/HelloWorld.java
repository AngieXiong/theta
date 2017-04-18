package com.theta.framwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello, world! It comes from spring-mvc!";
	}
}
