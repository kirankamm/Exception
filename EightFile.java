package com.xwork.exceptionapp;

import java.io.File;
import java.io.IOException;

public class EightFile {
public static void main(String[] args) {
	
	
	
	File f=new File("C:\\Users\\Dell\\Desktop\\File\\EightFile");
			
			
			try {
				if(f.createNewFile()){
System.out.println("file is created successfully");		

}else {

System.out.println("File is alreday created");
}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
}