package com.springlifecy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	
	public static void main(String[] args) {
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springlifecy/config.xml");
	
	Somosa s1=(Somosa)context.getBean("s1");
	System.out.println(s1)	;
	context.registerShutdownHook();
	
	System.out.println("+++++++++++++2nd Method");
	Pepsi p1=(Pepsi)context.getBean("p1");
	System.out.println(p1);
	
	System.out.println("++++++++++3rd way +++++++++");
	Example example= (Example)context.getBean("example");
	System.out.println(example	);
	
	}
}
