package com.xworkz.excptnapp.showrom;

public class IdNotFoundException extends Exception {

	String errorMassage;
	
	public IdNotFoundException(String errorMassage) {
		
		
		super(errorMassage);
	}
	
}
