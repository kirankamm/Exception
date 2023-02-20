package com.xworkz.exceptionapp.hospital;

import java.util.Scanner;


public class HospitalTester {

public static void main(String args []){

	System.out.println("METHOD HAS STARTED");

	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size");
	int size =scan.nextInt();
	Hospital hos=new Hospital(size);
	
	
	//ApollooHospital apol =new ApolloHospital();  //variable can be used for child class ApolloHospital
	// or
	//Hospital hospital=new ApollooHospital(size);
	
	for (int i=0;  i<size; i++) 
	     {
		
		/*    
		Patient pat=new 
		Patient(size) ;

		or */
		
		
		
		System.out.println("Enter the patientId");
	    int	patientId=scan.nextInt();
		
		
		
		System.out.println("Enter the patientName");
		String patientName=scan.next();
		
		System.out.println("Enter the age");
		int Age=scan.nextInt();
		
			
		
		System.out.println("Enter the Email");
		String Email=scan.next();
		//pat.setEmail(Email);
		
		//EmailNotFoundException emailNotFoundException=new  EmailNotFoundException();
				
		
		
		System.out.println("Enter the gender");
		String Gender=scan.next();
		//pat.setGender(Gender);
	    
		System.out.println("Enter the bloodGroup");
		String BloodGroup=scan.next();
		//pat.setBloodGroup(BloodGroup);
		Patient pat=new Patient(patientId,patientName,BloodGroup,Gender,Age, Email) ;


		hos.admit(pat);
	     }

	int option=0;
	String enter="no";
	do {
			
		System.out.println("Enter 1 to get all patients details");
		System.out.println("Enter 2 to get Patient datais by patient Id");
		System.out.println("Enter 3 to update patient name  by Patient id");
		System.out.println("Enter 4 to get patient detais by patient age ");
		System.out.println("Enter 5 to get patient detais by patient name ");
		System.out.println("Enter 6 to get patient detais by patient blood group ");
		System.out.println("Enter 7 to get patient detais by patient gender ");
		System.out.println("Enter 8 to EXIT");

		
		option = scan.nextInt();
        switch(option) {
        
		case 1:hos.getAllPatients();
		break;
	    
		case 2:System.out.println("Enter the patient Id");
		int id = scan.nextInt();
			try {
				hos.getPatientByPatientId(id);
			} catch (IdNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				System.out.println("Inside finaly block..which will excute anytime");
				if(scan !=null) {
					scan.close();
					
				}
				
			}
		break;
		
		case 3:System.out.println("Enter the patient id");
		int idl=  scan.nextInt();
		System.out.println("enter the new name to be   updated");
		String newName=scan.next();
			try {
				hos.updateNameByPatientId(newName,idl);
			} catch (upadateNameNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			finally{
				if(scan!=null);
				scan.close();
				
			}
		break;
		
		
		case 4:System.out.println("Enter the patient age");
		int age= scan.nextInt();
			try {
				hos.getPatientByPatientAge(age);
			} catch (AgeNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				System.out.println("Inside finaly block....which will excute anytimes");
				if(scan !=null) {
					scan.close();
				}
			}
			
		break;
		
		
		
		case 5:System.out.println("Enter the patient name");
		String patientName=  scan.next();
			try {
				hos.getPatientByPatientName(patientName);
			} catch (NameNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if(scan !=null)
				scan.close();
			}
		break;
		

		case 6:System.out.println("Enter the patient blood group");
		String bloodGroup=  scan.next();
			try {
				hos.getPatientByPatientBloodGroup(bloodGroup);
			} catch (BloodGroupNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally{
				System.out.println("Inside finaly block....which will excute anytimes");

				if(scan!=null )
			      scan.close();
			}
				
			
		break;
		
		
	   case 7:System.out.println("Enter the patient gender");
		
	   String gender=  scan.next();
		try {
		hos.getPatientByPatientGender(gender);
		} catch (GenderNotFoundException e) {
			e.printStackTrace();
		}
		
		finally{
			System.out.println("Inside finaly block....which will excute anytimes");

			if(scan!=null )
		      scan.close();
		}
		
		break;
		
		case 8:System.out.println("Do yo want to continue");
      
    		   
		break;
		
		
        default:System.out.println("please enter the valid number");
        break;
        
        }
        
        System.out.println("TYPE--yes/no");
        enter =scan.next();
        
	     }
        while(enter.equals("yes"));
        		
        		System.out.println("METHOD HAS ENDED");
        		
        		scan.close();

        }
	}
        		
        		
       
