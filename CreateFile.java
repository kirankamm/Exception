package com.xwork.exceptionapp;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		
		File f=new File("C:\\Users\\Dell\\Desktop\\File\\CreateFile");
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

