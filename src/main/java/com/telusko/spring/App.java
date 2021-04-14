package com.telusko.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       
       Samsung obj = context.getBean(Samsung.class);
       obj.config();
    		   
    }
}
