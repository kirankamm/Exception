package com.xworkz.exceptionapp.hospital;


public class Hospital {

	Patient patient[];
    int index;
   
    public Hospital(int size) {

    System.out.println("Hospital object is created");
	patient=new Patient[size];
    
    }
    
    	
public Hospital(){
   
   }

   
public boolean admit(Patient patient){      //Implementation....in industry//
	
System.out.println("Admit process started");

boolean isAdmitted=false;
if(patient.getPatientName() !=null) {
this.patient[index++]=patient;
 	    	
 System.out.println("Patient Admit process succesfully");
 	    	
            isAdmitted =true;
 	         }
 	        System.out.println("Admit process ended");

 	   return isAdmitted;
}
 


public void getAllPatients() {

System.out.println("List of patient are");
for (int i=0; i<this.patient.length; i++) {

System.out.println(patient[i].getPatientId()+" "+ patient[i].getPatientName()+" "+
patient[i].getBloodGroup()+" "+patient[i].getGender()+" "+patient[i].getAge());

}	  	   	    	

}
 

//get patient to patient name//

public Patient getPatientByPatientId(int patientId) throws IdNotFoundException {
	
	System.out.println("INSIDE getPatientByPatientId METHOD");

	    for(int in=0; in<patient.length; in++) {
	
		if(patient [in].getPatientId()==patientId) {
			
		System.out.println("PATIENT ID MATCHING ....PROCEED THE DATA");
		
		System.out.println(patient[in].getPatientId()+" "+ patient[in].getPatientName()+" "+
				patient[in].getBloodGroup()+" "+patient[in].getGender()+" "+patient[in].getAge());
		return patient[in];
		}
		
	}
	System.out.println("END of getPatientByPatientId METHOD");	
return null;
}	
	

//patient to patient name//
	public Patient getPatientByPatientName(String patientName) throws NameNotFoundException {
		
		System.out.println("INSIDE getPatientByPatientName METHOD");
		
		for(int j=0; j<patient.length; j++) {
		if(patient [j].getPatientName().equals(patientName)) {
				
			System.out.println("PATIENT Name MATCHING ....PROCEED THE DATA");
			
			System.out.println(patient[j].getPatientId()+" "+ patient[j].getPatientName()+" "+
					patient[j].getBloodGroup()+" "+patient[j].getGender()+" "+patient[j].getAge());
			return patient[j];
			}
			
		}
		System.out.println(" END of getPatientByPatientName METHOD");	
		return null;
	}
	
	
	
	
	public Patient getPatientByPatientBloodGroup(String bloodGroup) throws BloodGroupNotFoundException {
		
		System.out.println("INSIDE getPatientByPatientBloodGroup METHOD");
		
		for(int k=0; k<patient.length; k++) {
		if(patient [k].getBloodGroup().equals(bloodGroup)) {
				
			System.out.println("PATIENT ID MATCHING ....PROCEED THE DATA");
			
			System.out.println(patient[k].getPatientId()+" "+ patient[k].getPatientName()+" "+
					patient[k].getBloodGroup()+" "+patient[k].getGender()+" "+patient[k].getAge());
			return patient[k];
			}
			
		}
		System.out.println(" END of getPatientByPatientBloodGroup METHOD");	
		return null;
	}
	
	
	
	
public Patient getPatientByPatientGender(String  gender) throws GenderNotFoundException {
		
		System.out.println("INSIDE getPatientByPatientGender METHOD");
		
		for(int L=0; L<patient.length; L++) {
		if(patient [L].getGender().equals(gender)) {
				
			System.out.println("PATIENT ID MATCHING ....PROCEED THE DATA");
			
			System.out.println(patient[L].getPatientId()+" "+ patient[L].getPatientName()+" "+
					patient[L].getBloodGroup()+" "+patient[L].getGender()+" "+patient[L].getAge());
			return patient[L];
			}
			
		}
		System.out.println(" END of getPatientByPatientGender METHOD");	
		return null;
	}
	
	

public Patient getPatientByPatientAge(int  age) throws AgeNotFoundException {
	
	System.out.println("INSIDE getPatientByPatientAge METHOD");
	
	for(int K=0; K<patient.length; K++) {
	if(patient [K].getAge()==(age)) {
			
		System.out.println("PATIENT age MATCHING ....PROCEED THE DATA");
		
		System.out.println(patient[K].getPatientId()+" "+ patient[K].getPatientName()+" "+
				patient[K].getBloodGroup()+" "+patient[K].getGender()+" "+patient[K].getAge());
		return patient[K];
		}
		
	}
	System.out.println(" END of getPatientByPatientAge METHOD");	
	return null;
}




public Patient getPatientByEmail(String email) throws EmailNotFoundException {
	
	System.out.println("inside getPatientByEmail method");
	
	for(int x=0; x<patient.length; x++) {
	if(patient [x].getEmail().equals(email)) {
		
	
	System.out.println("PATIENT email matching...process data");
	}
	
	System.out.println( patient[x].getPatientId()+" "+patient[x].getPatientName()+" "+
	patient[x].getBloodGroup()+" "+patient[x].getGender()+" "+patient[x].getAge());
	}
	System.out.println("End of getPatientByEmail method");
	return null;
}

	


public Patient updateNameByPatientId(String newPatientName,int patientId) throws upadateNameNotFoundException {
	
	System.out.println("INSIDE updateNameByPatientId METHOD");
	
	for(int b=0; b<patient.length; b++) {
	if(patient [b].getPatientId()==(patientId)) {
			
		System.out.println("PATIENT ID MATCHING ....PROCEED THE DATA");
		patient[b].setPatientName(newPatientName);

		System.out.println(patient[b].getPatientId()+" "+ patient[b].getPatientId()+" "+
				patient[b].getBloodGroup()+" "+patient[b].getGender()+" "+patient[b].getAge());
		return patient[b];
		}
		
	}
	System.out.println(" END of updateNameByPatientId METHOD");	
	return null;
}



	
	}
/*


public boolean updatePatientAgeByPatientId(int newAge,int patientId) {
boolean isAgeUpdate=false;
	  System.out.println("updatePatientAgeByPatient started");
for(int i = 0; i< patient.length;i++) {
if(patient[i].patientId==patientId) {
			  System.out.println("The Current Age is+patient[i].age");
			  patient[i].age=newAge;
			  System.out.println("The Current Age is+patient[i].age");
		  }
	  }
return isAgeUpdate ;  
 
}


}*/

