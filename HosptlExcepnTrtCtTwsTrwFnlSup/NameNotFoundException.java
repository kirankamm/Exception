package com.xworkz.exceptionapp.hospital;

public class NameNotFoundException extends Exception {

	
	String errorMassage;
	
	public NameNotFoundException (String errorMassage) {
		
		super (errorMassage);
		
	}
	
	
	
}
