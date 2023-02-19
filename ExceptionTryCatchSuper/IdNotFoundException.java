package com.xworkz.exceptionapp.hospital;

public class IdNotFoundException extends Exception{

	
	String errorMessage;

	public  IdNotFoundException(String errorMessage) {
		super (errorMessage);
		
	}
	 }
