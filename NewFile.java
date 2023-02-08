package com.xwork.exceptionapp;

import java.io.File;
import java.io.IOException;

public class NewFile {
	
	
public static void main(String[] args) {
	

	
File k=new File("C:\\Users\\Dell\\Desktop\\File\\NewFile");
{
	try {
		if(k.createNewFile()) {
		
System.out.println("File succesfully created");	
}
else {
		
		System.out.println("File is already existed.....!");	
}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
}
