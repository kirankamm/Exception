package com.xwork.exceptionapp;

import java.io.File;
import java.io.IOException;

public class TenFile {
	
public static void main(String[] args) {
	
	File go=new File("C:\\Users\\Dell\\Desktop\\File\\TenFile");
	
	try {
		if(go.createNewFile()){
			System.out.println("File creation is successfull");
			
		}else {
			
			System.out.println("File is already created..!");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
