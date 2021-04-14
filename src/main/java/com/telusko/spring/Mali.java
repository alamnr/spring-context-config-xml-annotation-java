package com.telusko.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Mali implements Processor {

	@Override
	public void process() {
		System.out.println("Mali processor");
	}

}
