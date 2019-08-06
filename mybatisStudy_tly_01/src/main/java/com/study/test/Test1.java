package com.study.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.study.bean.StudentBean;

public class Test1 {
	@Test
	public void t1() {
		String resource = "mybatis-config.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(in);
		SqlSession session =factory.openSession(); 
		try {
			StudentBean studentBean =session.selectOne("com.study.mapper.StudentMapper.getStudentById", 1) ;
			System.out.println("根据Id查学生信息： "+studentBean.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
}
