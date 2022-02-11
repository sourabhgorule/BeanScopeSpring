package com.beanscope.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach c=context.getBean("coach",Coach.class);
		Coach b=context.getBean("coach",Coach.class);
		
		System.out.println(c+"  "+b);
		System.out.println(c.dailyRoutin());
		System.out.println(c.getfortune());
		
		context.close();
		
	}

}
