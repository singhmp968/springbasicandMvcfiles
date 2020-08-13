package com.springIOCAssign2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context	= new ClassPathXmlApplicationContext("com/springIOCAssign2/cconfig.xml");
		paracon pc = (paracon)context.getBean("per");
		System.out.println(pc);
	}

}
