package com.yin.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect  //���ý�����
public class Log {

	//�����е㣬û�з����壬Ϊ�˷�������ͬ������������ʹ�ô������
	@Pointcut
	public void add(){
		
	}
}
