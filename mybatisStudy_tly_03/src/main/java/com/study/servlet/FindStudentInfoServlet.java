package com.study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.bean.StudentBean;
import com.study.dao.StudentDao;

@WebServlet("/findStudentInfoServlet")
public class FindStudentInfoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("begin ...");
		//定义持久层 
		StudentDao studentDao=new StudentDao();
		//定义初始化参数	
		Integer studentId = null;
		//获取参数
		String id = req.getParameter("studentId");
		System.out.println("学生Id为111111——>： "+studentId);
		
		if (null != id && "".equals(id)) {
			studentId=Integer.parseInt(id);

		}
		System.out.println("学生Id为： "+studentId);
		//调用持久层方法根据id获取学生信息
		StudentBean studentBean=studentDao.findStudentById(2);
		//将获取的内容放到request中
		req.setAttribute("studentBean",studentBean);
		req.getRequestDispatcher("info.jsp").forward(req, resp);
	}

}
