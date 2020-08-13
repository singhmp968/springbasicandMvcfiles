package com.Assign5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assign5 {
public static void main(String[] args) {
	ApplicationContext context = 	new ClassPathXmlApplicationContext("com/Assign5/reconfig.xml");
	Player pl = (Player) context.getBean("p1");
	System.out.println(pl);
	Player pl2 = (Player) context.getBean("p2");
	System.out.println(pl2);
	
	Player pl3 = (Player) context.getBean("p3");
	System.out.println(pl3);

	Player pl4 = (Player) context.getBean("p4");
	System.out.println(pl4);
	
	Player pl5 = (Player) context.getBean("p5");
	System.out.println(pl5);


}

}
