package com.xwork.exceptionapp;

import java.io.File;
import java.io.IOException;

public class SixFile {

	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\Dell\\Desktop\\File\\SixFile");
		
		try {
			if(f.createNewFile()) {
				System.out.println("file is successafully created");
				
			}else {
				System.out.println("File is already created");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
