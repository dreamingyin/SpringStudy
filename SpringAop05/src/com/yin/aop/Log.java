package com.yin.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect  //设置界面类
public class Log {

	//配置切点，没有方法体，为了方便其他同类中其他方法使用此切入点
	@Pointcut
	public void add(){
		
	}
}
