package com.xwork.exceptionapp;

public class ClassNotFountExcpation {

	
	public static void main(String[] args) {

		System.out.println("main method strarted");
		try {
		Class cls=Class.forName("com.xwork.exceptionapp.ClassNotFountExcpation");
		System.out.println(cls);

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	/*	file file= ...create 10 file
*/		
		

		System.out.println("main method ended");
		
	}
		
		/*forname study*/
		
		
		
		
	}





