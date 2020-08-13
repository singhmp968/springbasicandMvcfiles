package com.sprinAss3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assign3 {
public static void main(String[] args) {
	ApplicationContext context	= new ClassPathXmlApplicationContext("com/sprinAss3/setconfig.xml");
	SetterMessage sm = (SetterMessage)context.getBean("per");
	System.out.println(sm);
	
}
}
