package com.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
        ApplicationContext context	= new ClassPathXmlApplicationContext("config.xml");

        circle t= (circle)context.getBean("cir");
        t.draw();
        rectanglr rt = (rectanglr)context.getBean("rec");
      rt.draw();
        parallelogram pl = (parallelogram)context.getBean("par");
      pl.draw();
    }
}
