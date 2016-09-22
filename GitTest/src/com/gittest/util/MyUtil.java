package com.gittest.util;

//import java.util.Map;

public class MyUtil {
	
	String ProcessorFamily;
	String processorCount;
	String userName;
	String sysName;
	String DomainName;
	
	
	public MyUtil() {
		super();
		this.ProcessorFamily = System.getenv("PROCESSOR_IDENTIFIER");
		this.processorCount = System.getenv("NUMBER_OF_PROCESSORS");
		this.userName = System.getenv("USERNAME");
		this.sysName = System.getenv("COMPUTERNAME");
		this.DomainName = System.getenv("USERDOMAIN");
	}

	public void getSysInfo(){
		
		//Map list = System.getenv();
		//System.out.println(list);
		
		
		System.out.println("Processor Family: " + this.ProcessorFamily);
		System.out.println("Total Processor count: "+ this.processorCount);
		System.out.println("Current User Name : "+ this.userName);
		System.out.println("System Name on Domain: "+this.sysName);
		System.out.println( "The DOMAIN NAME is : "+ this.DomainName);
		
	}
}
