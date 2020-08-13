package com.assign4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 	new ClassPathXmlApplicationContext("com/assign4/reconfig.xml");
		student st = (student)context.getBean("std");
	student s2 = (student)context.getBean("std2");
		System.out.println(st);
	System.out.println(s2);
	}

}
