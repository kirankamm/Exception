package com.xworkz.excptnapp.showrom;

public class Showroom 
{
	Manager manager[] =new Manager[2];
			
			int  i;

			private long newcontactNo;

			private String gender;
			
	public Showroom() {
			
	}
	
	public String saveManager(Manager manager) 
				{
			System.out.println("method 1 start");
	                if(manager.managerName != null && !(manager.managerName.isEmpty())) {
		            this.manager[i++]=manager;
				  }
	                return"qwerty";
				  }
	
	
	public void getDetails(){
		
	System.out.println("method 2 start");
		
	 for (int i=0;  i<manager.length; i++) {
			 
	System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);
		 }
	     }
	
	
	public Manager getManagerByQualification(String qualification) throws QualificationNotFoundException{
		System.out.println("method 3 start");
		
		 for (int i=0;  i<manager.length; i++) {
		 if(manager[i].qualification.equals(qualification)){ 
					 
		System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);
		 }
	     }
		 return null;
		 }
	
	
	public Manager getManagerNameByAddress(String address) throws QualificationNotFoundException {
		System.out.println("method By Address start");
		
		for (int i=0;  i<manager.length; i++) {
	    if(manager[i].addres.equals(address)){ 
					 
			 System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);
			 }
		}
		return null;
		}
	
	

	
	public Manager getManagerBymanagerName(String managerName) throws NameNotFoundException {
		
		for (int i=0;  i<manager.length; i++) {
		if(manager[i].managerName.equals(managerName)){ 
			
		System.out.println("method By ID start");
		
		System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);
			 }
		}
		return null;}
	
	public Manager getManagerNameBymanagerID(int managerId) throws IdNotFoundException {
		
		for (int i=0;  i<manager.length; i++) {
		if(manager[i].managerId==managerId){ 
			
		System.out.println("method By ID start");
		
		System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);
			 }
		}
		return null;}
	
	public Manager getManagerByGender(String gender) throws GenderNotFoundException {
		
		
		for (int i=0;  i<manager.length; i++) {
		if(manager[i].gender.equals(gender)){ 
			
		System.out.println("method By gender start");
		
		System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);
			 }
		}
		return null;
		}
	
	
	public Manager updateContacteNoByManagerId(long newContacteNo,int managerID) {
		System.out.println("method update By ID start");
		
		for (int i=0;  i<manager.length; i++) {
			if(manager [i].getContactNo()==(newContacteNo)) {
				
				System.out.println("manager ID MATCHING ....PROCEED THE DATA");
				manager[i].setContactNo(newContacteNo);
		
		System.out.println(manager[i].contactNo);
		manager[i].setContactNo(newContacteNo);

		System.out.println(manager[i].managerId+" "+manager[i].managerName+
						" "+manager[i].gender+" "+manager[i].contactNo+" "+manager[i].qualification);
			 }
		}
		return null;}

	public void getAllManager() {
		// TODO Auto-generated method stub
		
	}

	public void updateContacteNoByManagerId(long newContacteNo) {
		// TODO Auto-generated method stub
		
	}
	
}
	
	
	
	
	
		
		
		
		
		
		
        