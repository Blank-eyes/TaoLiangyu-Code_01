package com.study.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AspectTest {
	
	@Pointcut(value="execution(void com.study.service.impl.*ServiceImpl.add*(..))")
	public void pointcut() {
		
	}
	
/*	@AfterThrowing(value="execution(void com.study.service.impl.*ServiceImpl.add*())")
	public void throwingMethod() {
		System.out.println("异常抛出。。。");
	}	
	
	@After(value="execution(void com.study.service.impl.*ServiceImpl.add*())")
	public void addLog() {
		Date date =new Date();
		int hour = date.getHours();
		int minute = date.getMinutes();
		int second = date.getSeconds();
		System.out.println(hour + "时 " + minute + "分 " + second + "秒新增/修改了数据!!!");
	}
	@AfterReturning(value="execution(void com.study.service.impl.*ServiceImpl.add*())")
	public void returningMethod() {
		System.out.println("后置通知。。。");
	}
    
	@Before(value="execution(void com.study.service.impl.*ServiceImpl.add*())")
	public void beforeMethod() {
		System.out.println("前置通知。。。");
	}*/

/*	@Around(value="execution(void com.study.service.impl.*ServiceImpl.add*(..))")
	public void aroundMethod(ProceedingJoinPoint joinPoint ) {
		System.out.println("开启事务。。。");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		//最终通知
		System.out.println("提交事物");
		
	}*/
    @Around(value="pointcut()")
	public void aroundMethod(ProceedingJoinPoint joinPoint ) {
		System.out.println("开启事务。。。");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		//最终通知
		System.out.println("提交事物");
		
	}
}











