package com.spring.subscriber;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.event.BigBangTheory;

@Component
public class Amisha {

	
	@EventListener
	public void alsoWatchingBBT(BigBangTheory event) {
		System.out.println("Amisha is viewing Big Bang Theory");
	}
}
