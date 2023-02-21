package com.xworkz.excptnapp.showrom;

public class QualificationNotFoundException extends Exception {

	String errorMassage;
	
	public QualificationNotFoundException (String errorMassage) {
		
		super(errorMassage);
		
		
	}
	
	
	
}
