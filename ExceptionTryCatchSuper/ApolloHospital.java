package com.xworkz.exceptionapp.hospital;


public class ApolloHospital extends Hospital {

	public boolean isApplicationFormFilled=true;
	private Object id;
	  
	public ApolloHospital(int size) {
	
    patient=new Patient[size];
	
	System.out.println("ApolloHospital Object is created");
	}
	
//method overriding
	
	@Override
	
	    public boolean admit(Patient patient) {
		
		System.out.println("Inside add Patient of ApolloHospital");
		
		if(isApplicationFormFilled==true) {
			
	    System.out.println("Form the Filling comletely can add the patient now ...hurry");
		
		return super.admit(patient);
		}
		return false;
		}
	
	
	public String canteen() {
	System.out.println("Eating");
		return "idaly";
	}

	
	@Override
	
	public Patient getPateintByEmail(String email) throws EmailNotFoundException  {
		
		System.out.println("Inside getPateintByEmail method ");
		
		System.out.println("one parameter :String"+email);
		for (int in=0; in<patient.length;in++) {
			if(patient[in].getEmail().equals(email)) {
				
				System.out.println("Patient  email macthing the poccess....data ");
				System.out.println(patient[in]);
				
				return patient[in]; 
			}else{
				throw new EmailNotFoundException("No patient found given email");
			}
			
			}
				
			
		return null;	
		}
		
	
	@Override
	
	public Patient getPatientByPatientId(int patientId)   {
		
		System.out.println("Inside getPatientByPatientId method ");
		
		System.out.println("one parameter :String"+id);
		for (int inn=0; inn<patient.length;inn++) {
			if(patient[inn].getId().equals(id)) {
				
				System.out.println("Patient  i macthing the poccess....data ");
				System.out.println(patient[inn]);
				
				return patient[inn]; 
			}else{
				throw new EmailNotFoundException("No patient found given email");
			}
			
			}
				
			
		return null;	
		}
		
			
	}
	
	
	
	
	
	
	
	

