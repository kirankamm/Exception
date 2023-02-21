package com.xworkz.excptnapp.showrom;

public class GenderNotFoundException extends Exception {

	String errorassage;
	
	public GenderNotFoundException(String errorassage) {
		
		super(errorassage);
		
		
	}
	
}
