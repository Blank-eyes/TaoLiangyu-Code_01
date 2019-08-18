package com.study.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.study.service.PersonService;

@WebServlet(urlPatterns = "/helloServlet")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext servletContext =req.getServletContext();
		WebApplicationContext applicationContext = WebApplicationContextUtils.findWebApplicationContext(servletContext);
		PersonService personService = (PersonService) applicationContext.getBean("personService");
		personService.walk();
	}
}
