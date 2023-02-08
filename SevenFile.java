package com.xwork.exceptionapp;

import java.io.File;
import java.io.IOException;

public class SevenFile {

	public static void main(String[] args) {
		
		File king=new File("C:\\Users\\Dell\\Desktop\\File\\SevenFile");
		
		
		try {
			if(king.createNewFile()) {
				System.out.println("File creation is successfull");
				
			}else {
				
				System.out.println("File already created....!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
