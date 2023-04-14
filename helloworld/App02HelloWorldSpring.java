package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.superContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args){
	//launch a Spring Context
		
		try(var context = 	
				new	AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
		{

			 System.out.println(context.getBean("name"));

			 System.out.println(context.getBean("age"));
			 
			 System.out.println(context.getBean("person"));
			 
			 System.out.println(context.getBean("person2MethodCall"));
			 
			 System.out.println(context.getBean("person3Parameters"));
				
			 
			 System.out.println(context.getBean("address2"));
			 
			 System.out.println(context.getBean("Person.class"));
			 
		   	System.out.println(context.getBean("Address.class"));
			
		    System.out.println(context.getBean("person5Qualifier"));
			 //System.out.println
//			 Arrays.stream( context.getBeanDefinitionNames()).
			// forEach(System.out::println);
			 
		}
		
		;
	
		
		// Configure the things that we want Spring to manage -@Configuration
	 //HelloWOrldConfiguration - @COnfiguration
	//name- @Bean
// 3: Retrieving Beans managed by Spring
	

	 
	
	}
	
}
