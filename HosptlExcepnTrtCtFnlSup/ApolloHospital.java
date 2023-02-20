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
	//change i,in,in,k,l is possible in override//

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
	
	public Patient getPatientByEmail(String email) throws EmailNotFoundException  {
		
		System.out.println("Inside getPatientByEmail method ");
		
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
	//change i,in,in,k,l is possible in override//
	
	public Patient getPatientByPatientId(int patientId)   {
		
		System.out.println("Inside getPatientByPatientId method ");
		
		System.out.println("one parameter :String"+id);
		for (int in=0; in<patient.length;in++) {
			if(patient[in].getPatientId()==(patientId)) {
				
				System.out.println("Patient  id macthing the proccess....data ");
				System.out.println(patient[in]);
				
				return patient[in]; 
			}else{
				throw new EmailNotFoundException("No patient found given id");
			}
			
			}
				
			
		return null;	
		}
	
		
	@Override
	
	public Patient getPatientByPatientAge(int age) throws AgeNotFoundException   {
		
		System.out.println("Inside getPatientByPatientAge method ");
		
		System.out.println("one parameter :String"+age);
		
		    for (int in=0; in<patient.length;in++) {
			if(patient[in].getAge()==(age)) {
				
				System.out.println("Patient  age macthing the proccess....data ");
				
				System.out.println(patient[in]);
				
				return patient[in]; 
			}else{
				throw new AgeNotFoundException("No patient found given age");
			}
			
			}
			
		return null ;	
		}
		
			
	
	@Override
	
	public Patient getPatientByPatientName(String name) throws NameNotFoundException   {
		
		System.out.println("Inside getPatientByPatientName method ");
		
		System.out.println("one parameter :String"+name);
		
		    for (int in=0; in<patient.length;in++) {
			if(patient[in].getPatientName().equals(name)) {
				
				System.out.println("Patient  name macthing the proccess....data ");
				
				System.out.println(patient[in]);
				
				return patient[in]; 
			}else{
				throw new NameNotFoundException("No patient found given name");
			}
			
			}
			
		return null ;	
		}

	
	@Override
	
	public Patient getPatientByPatientBloodGroup(String bloodGroup) throws BloodGroupNotFoundException   {
		
		System.out.println("Inside getPatientByPatientBloodGroup method ");
		
		System.out.println("one parameter :String"+bloodGroup);
		
		    for (int in=0; in<patient.length;in++) {
			if(patient[in].getBloodGroup().equals(bloodGroup)) {
				
				System.out.println("Patient  bloodGroup macthing the proccess....data ");
				
				System.out.println(patient[in]);
				
				return patient[in]; 
			}else{
				throw new BloodGroupNotFoundException("No patient found given bloodGroup");
			}
			
			}
			
		return null ;	
		}

	
@Override
	
	public Patient getPatientByPatientGender( String gender) throws GenderNotFoundException   {
		
		System.out.println("Inside getPatientByPatientGender method ");
		
		System.out.println("one parameter :String"+gender);
		
		    for (int in=0; in<patient.length;in++) {
			if(patient[in].getGender().equals(gender)) {
				
				System.out.println("Patient  gender macthing the proccess....data ");
				
				System.out.println(patient[in]);
				
				return patient[in]; 
			}else{
				throw new GenderNotFoundException("No patient found given gender");
			}
			
			}
			
		return null ;	
		}
	
	
@Override
public Patient updateNameByPatientId(String newPatientName,int patientId) throws upadateNameNotFoundException  {
	
	System.out.println("Inside updateNameByPatientId method ");
	
	System.out.println("one parameter :String"+newPatientName);
	for(int in=0; in<patient.length; in++) {
		if(patient [in].getPatientName()==(newPatientName)) {
			
			System.out.println("Patient  update Name macthing the poccess....data ");
			System.out.println(patient[in]);
			
			return patient[in]; 
		}else{
			throw new upadateNameNotFoundException("No patient found given email");
		}
		
		}
			
		
	return null;	
	}
	
	
	
	
	
	
			
	}
	
	
	
	
	
	
	
	

