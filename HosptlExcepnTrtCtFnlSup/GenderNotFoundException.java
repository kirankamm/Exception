package com.xworkz.exceptionapp.hospital;

public class GenderNotFoundException extends Exception {

	String ErrorMassage;
	
	public GenderNotFoundException (String errorMassage) {
		
		
		super(errorMassage);
	}
	
	
}
