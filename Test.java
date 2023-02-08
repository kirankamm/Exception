package com.xwork.exceptionapp;

public class Test {
	
	/*exception handel*/
public static void main(String[] args) {
	
	System.out.println("main method started");
	
	try{int a=10, b=0, c;
	
	c=a/b;
	
	System.out.println(c);}
	
	catch(Exception e) {
		
		System.out.println ( "can not divided by zero");
	}

	System.out.println("main method ended"); 
}
}
