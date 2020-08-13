package Assign2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assign2 {
public static void main(String[] args) {
ApplicationContext context	= new ClassPathXmlApplicationContext("config.xml");

test t= (test)context.getBean("tesst");
System.out.println(t);
}
}
