package com.xworkz.exceptionapp.hospital;

public class AgeNotFoundException extends Exception {

	
	String errorMessage;

	public  AgeNotFoundException(String errorMessage) {
		super (errorMessage);
		
	}
	
	
}
