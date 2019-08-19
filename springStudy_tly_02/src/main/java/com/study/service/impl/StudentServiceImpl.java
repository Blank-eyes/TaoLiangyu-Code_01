package com.study.service.impl;

import org.springframework.stereotype.Service;

import com.study.service.StudentService;
@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Override
	public void addStudent() {

		//int i= 10/0;
		System.out.println("添加学生信息");
	}

	@Override
	public void modifyStudent() {

		System.out.println("修改学生信息");
	}

}
