package com.study.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {

	private static SqlSession sqlSession=null;
	static {
		String resoure = "mybatis-config.xml";
		InputStream inputStream =null;
	
		try {
			inputStream=Resources.getResourceAsStream(resoure);
			SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession =sessionFactory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSqlSession() {
		return sqlSession;
	};
}
