package com.spring.listener;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextListener {

	@EventListener
	public void contextStart(ContextStartedEvent event) {
		System.out.println("Aman : Listener - Context Started");
	}
	
	@EventListener
	public void contextClose(ContextClosedEvent event) {
		System.out.println("Aman : Listener - Context Closed");
	}
	
	@EventListener
	public void contextStopped(ContextStoppedEvent event) {
		System.out.println("Aman : Listener - Context Stopped");
	}

}
