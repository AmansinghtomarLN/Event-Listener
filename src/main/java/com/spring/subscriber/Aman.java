package com.spring.subscriber;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.event.BigBangTheory;

@Component
public class Aman {

	@EventListener
	public void watchBigBangTheory(BigBangTheory event) {
		System.out.println("Aman is viewing BBT ");
	}
	
	@EventListener
	public void watchBigBangTheory1(BigBangTheory event) {
		System.out.println("Aman family is viewing BBT");
	}
	
	@EventListener
	public void watchBigBangTheory2(BigBangTheory event) {
		System.out.println("Aman city is viewing BBT");
	}
}
