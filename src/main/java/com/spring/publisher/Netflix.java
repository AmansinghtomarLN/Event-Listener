package com.spring.publisher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.spring.event.BigBangTheory;
import com.spring.event.ComedyNights;

@Component
public class Netflix {
	
	@Autowired
	ApplicationEventPublisher publisher;

	public void stream_BigBangTheory() {
		System.out.println("Big Bang Theory Started");
		publisher.publishEvent(new BigBangTheory());
		
	}
		public void stream_ComedyNights() {
			System.out.println("Comedy nights Started");
			publisher.publishEvent(new ComedyNights());
			
		}

	
}
