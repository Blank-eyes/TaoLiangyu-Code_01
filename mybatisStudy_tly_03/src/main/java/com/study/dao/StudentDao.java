package com.study.dao;

import com.study.bean.StudentBean;
import com.study.mapper.StudentMapper;
import com.study.utils.SqlSessionUtil;

public class StudentDao {

	public StudentBean findStudentById(Integer studentId) {
		StudentBean studentBean =null;
		
		StudentMapper studentMapper =SqlSessionUtil.getSqlSession().getMapper(StudentMapper.class);
		try {
			studentBean = studentMapper.findStudentById(studentId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			SqlSessionUtil.getSqlSession().close();
		}
		
		return studentBean;
	}
}
