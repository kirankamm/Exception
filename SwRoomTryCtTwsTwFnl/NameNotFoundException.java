package com.xworkz.excptnapp.showrom;

public class NameNotFoundException extends Exception {

	String errorMassage;
	public NameNotFoundException(	String errorMassage) {
		
		super( errorMassage);
		
		
	}
}
