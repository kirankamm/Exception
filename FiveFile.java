package com.xwork.exceptionapp;

import java.io.File;
import java.io.IOException;

public class FiveFile {

	
	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\Dell\\Desktop\\File\\FiveFile");
		
		try {
			if(f.createNewFile()) {
				
				System.out.println("File is successefully created");
			}else {
				System.out.println("File is already created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
