package com.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.event.BigBangTheory;
import com.spring.publisher.Netflix;

public class Start {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Netflix netflix = context.getBean("netflix", Netflix.class); // First character must be small in
																					// component name
		netflix.stream_BigBangTheory();
		netflix.stream_ComedyNights();
	}


}
