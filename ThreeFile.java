package com.xwork.exceptionapp;

import java.io.File;
import java.io.IOException;

public class ThreeFile {

	public static void main(String[] args) {
		
		File t=new File("C:\\Users\\Dell\\Desktop\\File\\ThreeFile");
		
		try {
			if(t.createNewFile()) {
				
				System.out.println("File is succesfully created...");
				
			}else {
				
				System.out.println("File is Already created...!");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
}
