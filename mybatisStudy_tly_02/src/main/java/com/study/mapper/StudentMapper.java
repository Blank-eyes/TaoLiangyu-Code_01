package com.study.mapper;

import java.util.List;
import java.util.Map;

import com.study.bean.StudentBean;

public interface StudentMapper {
	//通过studenid 查学生
	public StudentBean getStudentById(Integer StudentId);
	//根据条件查询学生信息集合
	public List<StudentBean> findStudents(Map map);
	
	public void addStudent(StudentBean studentBean);
	
	public void delStudent(Integer studentId);
	
	public void modifyStudent(StudentBean studentBean);
}
