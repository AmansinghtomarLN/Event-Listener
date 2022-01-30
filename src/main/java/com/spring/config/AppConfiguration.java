package com.spring.config;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.publisher.Netflix;

@Configuration
@ComponentScan(basePackages = "com.spring")
public class AppConfiguration {

	@Bean
	public Netflix show() {
		Netflix netflix = new Netflix();
		return netflix;
	}
	
	@Bean
	public ApplicationEventPublisher publisher() {
		ApplicationEventPublisher publisher = new ApplicationEventPublisher() {
			
			@Override
			public void publishEvent(Object event) {
				// TODO Auto-generated method stub
				
			}
		}; 
		return publisher;
	}
	
}
