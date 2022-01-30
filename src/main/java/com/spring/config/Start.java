package com.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;

import com.spring.event.BigBangTheory;
import com.spring.listener.ContextRefreshedListener;
import com.spring.publisher.Netflix;

public class Start {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		context.start(); 
		Netflix netflix = context.getBean("netflix", Netflix.class); // First character must be small in
																		// component name
	//	ContextRefreshedListener refresh = context.getBean("contextRefreshedListener",ContextRefreshedListener.class);
		netflix.stream_BigBangTheory();
		netflix.stream_ComedyNights();
	}

}
