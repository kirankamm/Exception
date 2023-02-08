package com.xwork.exceptionapp;

import java.io.File;
import java.io.IOException;

public class FourFile {
public static void main(String[] args) {
	
	File f=new File("C:\\Users\\Dell\\Desktop\\File\\FourFile") ;
	
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
