
package com.xworkz.exceptionthowsapp;

import java.io.File;
import java.io.IOException;

public class ThowsCreateFile {

	public static void main(String[] args) {
		
 System.out.println("method started");
	
 try {
	m1();
} catch (ClassNotFoundException | IOException |NullPointerException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();

	 
 


		File f=new File("C:\\Users\\Dell\\Desktop\\File\\ThowsCreateFile");
		{
			try {
				if(f.createNewFile()) {
					System.out.println("File Successfully Create...");
					
				}else {
					
					System.out.println("File Already Exite......!");

					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
	}


   

public static void m1()  throws ClassNotFoundException,IOException,NullPointerException{
System.out.println("m1 started");
m2();
System.out.println("m2 ended");

}


public static void  m2()  throws ClassNotFoundException,IOException,NullPointerException{
	System.out.println("m1 started");
m3();
System.out.println("m2 ended");

}


public static void  m3() throws ClassNotFoundException,IOException,NullPointerException  {
	System.out.println("m1 started");
Class.forName("com.xworkz.exceptionthowsapp.File.ThowsCreateFile");




String str=null;

System.out.println(str.charAt(6));
System.out.println("m3 ended");

}
}





