package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	/**
	 * 只要参数带key 就可以直接取到？
	 * 
	 */
	
	@RequestMapping("/helloSpringMVC")
	public String helloSpringMVC() {
		
		System.out.println("hellp SpringMVC");
		
		return  "success";
	}
	
	@RequestMapping("/paramUrl/{name}")
	public String paramURL(@PathVariable("name") String name ) {
		System.out.println("前台所传参数为： "+name);
		
		return "success";
	}
	
	@RequestMapping("/paramRequest")
	public String paramRequest(String username,String password) {
		System.out.println("前台传过来的用户名为： "+username);
		System.out.println("前台传过来的密码为： "+password);
		
		return "success";
	}
	
	@RequestMapping("/paramRequest2")
	public String paramRequest2(String username,String password) {
		System.out.println("前台传过来的用户名为： "+username);
		System.out.println("前台传过来的密码为： "+password);
		
		return "success";
	}
	
}
