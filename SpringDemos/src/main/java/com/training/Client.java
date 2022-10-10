package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.HelloWorld;

public class Client
{
    public static void main( String[] args )
    {
        
    	//load the context 
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	HelloWorld hello = (HelloWorld) context.getBean("hello");
        
        System.out.println(hello.sayHello());
        
        
    }
}
