package com.xworkz.exceptionapp.hospital;

public class upadateNameNotFoundException extends Exception {

	
	String errorMassage;
	
	public upadateNameNotFoundException (String errorMassage){
	
		super (errorMassage);
	}
}
