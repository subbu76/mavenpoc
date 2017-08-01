package com.mavenpoc;

import java.util.Properties;

public class PrintConsole {
	
	public static void main(String[] args) throws Exception {
		System.out.println("About to read the properties file....");
		
		Properties props = new Properties();
		props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(
				"config/dummy.properties"));
		System.out.println(props.getProperty("samplekey"));
	}

}
