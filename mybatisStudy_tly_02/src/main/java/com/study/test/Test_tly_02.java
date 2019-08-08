package com.study.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.study.bean.FamilyBean;
import com.study.bean.StudentBean;
import com.study.mapper.FamilyMapper;
import com.study.mapper.StudentMapper;

public class Test_tly_02 {

	SqlSession sqlSession = null;

	@Before
	public void beforeMethod() {
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();

	}

	@After
	public void afterMethod() {
		if (null != sqlSession) {
			sqlSession.close();
		}
	}

	@Test
	public void t1() {
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		StudentBean studentBean = studentMapper.getStudentById(2);
		System.out.println("学生信息为：" + studentBean.toString());
	}

	@Test
	public void t2() {
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Map map = new HashMap();
		// 查询年纪小于24的人
		map.put("studentAge", 24);
		List<StudentBean> studentBeans = studentMapper.findStudents(map);
		for (StudentBean studentBean : studentBeans) {
			System.out.println("年龄小于24的学生： " + studentBean.toString());
		}
	}

	// 新增学生信息同时新增父母信息
	@Test
	public void t3() {
		StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
		FamilyMapper familyMapper= sqlSession.getMapper(FamilyMapper.class);
		//封装参数 学生信息
		StudentBean studentBean =new StudentBean();
	    studentBean.setStudentName("田七");
		studentBean.setStudentAge(25);
		studentBean.setStudentSex("女");
		 //封装参数  
	    FamilyBean fatherBean =new FamilyBean("父子", "田父");
	    FamilyBean motherBean =new FamilyBean("母子", "田母");
	    
	    try {
			studentMapper.addStudent(studentBean);
			System.out.println("新增学生的主键为：" +studentBean.getStudentId());
			
			fatherBean.setStudentId(studentBean.getStudentId());
			motherBean.setStudentId(studentBean.getStudentId());
			
			familyMapper.addFamily(fatherBean);
			familyMapper.addFamily(motherBean);
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		}
	}
	
	@Test
	public void t4() {
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		try {
			studentMapper.delStudent(4);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}
	@Test
	public void t5() {
		StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
		StudentBean studentBean =new StudentBean();
		studentBean.setStudentSex("男");
		studentBean.setStudentId(2);
		try {
			studentMapper.modifyStudent(studentBean);
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		}
	}
}






