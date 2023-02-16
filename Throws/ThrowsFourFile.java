package com.xworkz.exceptionthowsapp;

import java.io.File;
import java.io.IOException;

public class ThrowsFourFile {

	public static void main(String[] args) {
		
		
 System.out.println("method started");
	
 try {
	m1();
} catch (ClassNotFoundException | IOException |NullPointerException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
		
		
		File f=new File("C:\\Users\\Dell\\Desktop\\File\\ThrowsFourFile") ;
		
		try {
			if(f.createNewFile()) {
				
				System.out.println("File successfully created");
			}else {
				
				System.out.println("file is already existe");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
		
	}


  public static void m1()  throws ClassNotFoundException,IOException,NullPointerException{
System.out.println("m1 started");
m2();
System.out.println("m1 ended");

}


public static void  m2()  throws ClassNotFoundException,IOException,NullPointerException{
	System.out.println("m2 started");
m3();
System.out.println("m2 ended");

}


public static void  m3() throws ClassNotFoundException,IOException,NullPointerException  {
	System.out.println("m3 started");
Class.forName("com.xworkz.exceptionthowsapp.File.ThrowsFourFile");

String str=null;

System.out.println(str.charAt(6));
System.out.println("m3 ended");

}
}
