package com.telusko.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.telusko.spring")
public class AppConfig {

	/*
	 * @Bean public Samsung getPhone() { return new Samsung(); }
	 * 
	 * @Bean(name = "snapdragon")
	 * 
	 * public Processor getProcessor() { return new Snapdragon(); }
	 * 
	 * @Bean(name = "mali") //@Primary public Processor getProcessorMali() { return
	 * new Mali(); }
	 */
}
