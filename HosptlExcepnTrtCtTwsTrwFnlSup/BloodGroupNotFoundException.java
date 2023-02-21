package com.xworkz.exceptionapp.hospital;

public class BloodGroupNotFoundException extends Exception {

	
	String errorMassage;
	
	public  BloodGroupNotFoundException(String errorMassage) {
		
		super(errorMassage);
	}
	
	
	
}
