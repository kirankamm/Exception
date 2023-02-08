package com.xwork.exceptionapp;

import java.io.File;
import java.io.IOException;

public class NineFile {

	
	public static void main(String[] args) {
		
		File s=new File("C:\\Users\\Dell\\Desktop\\File\\NineFile");
		try {
			if(s.createNewFile()) {
				
				System.out.println("file is created bro");
			}else {
				
			System.out.println("File already creted...!"); 	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
