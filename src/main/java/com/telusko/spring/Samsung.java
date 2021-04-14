package com.telusko.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier(value = "mali")
	Processor cpu;
	
	
	
	/*
	 * public void setCpu( Processor cpu) { this.cpu = cpu; }
	 */

	/*
	 * public Samsung(Processor cpu) { this.cpu = cpu; }
	 */
	
	

	public Samsung() {
		
	}



	public void config() {
		System.out.println("Samsung pone");
		cpu.process();
	}

}
