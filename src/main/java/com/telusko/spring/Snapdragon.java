package com.telusko.spring;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor {

	@Override
	public void process() {
		System.out.println("Best processor snapdragon");
	}

}
