package com.xworkz.excptnapp.showrom;



public class MarutiSuzukiShowRoom extends Showroom {


		public boolean isApplicationFormFilled=true;
		private Object id;
		  
		public MarutiSuzukiShowRoom(int size) {
		
	    manager=new Manager[size];
		
		System.out.println("MarutiSuzukiShowRoom Object is created");
		}
		
	
		
		@Override
		//change i,in,in,k,l is possible in override//

		public String saveManager(Manager manager) 
		{
	System.out.println("method 1 start");
            if(manager.managerName != null && !(manager.managerName.isEmpty())) {
            this.manager[i++]=manager;
		  }
            return"qwerty";
		  }
		
		@Override
		
		public Manager getManagerByQualification(String qualification) throws QualificationNotFoundException{
			System.out.println("method 3 start");
			
			 for (int i=0;  i<manager.length; i++) {
			 if(manager[i].qualification==qualification){ 
			System.out.println("one parameter :String"+qualification);
		
					
					System.out.println("manager qualification  macthing the poccess....data ");
					System.out.println(manager[i]);
					
					return manager[i]; 
				}else{
					throw new QualificationNotFoundException("No manager found given qualification");
				}
				
				}
					
				
			return null;	
		}
	


		public Manager getManagerNameByAddress(String address) throws QualificationNotFoundException {
			System.out.println("method By Address start");
			
			for (int i=0;  i<manager.length; i++) {
		    if(manager[i].addres.equals(address)){
		    	System.out.println("one parameter :String"+address);
				
				
				System.out.println("manager address  macthing the poccess....data ");
				System.out.println(manager[i]);
				
				return manager[i]; 
			}else{
				throw new QualificationNotFoundException("No manager found given address");
			}
			
			}
				
			
		return null;	
		}
		
		
		
		public Manager getManagerBymanagerName(String managerName) throws NameNotFoundException {
			
			for (int i=0;  i<manager.length; i++) {
			if(manager[i].managerName.equals(managerName)){ 
				
			System.out.println("method By managerName start");
			System.out.println("one parameter :String"+managerName);
			
			
			System.out.println("manager address  macthing the poccess....data ");
			System.out.println(manager[i]);
			
			return manager[i]; 
		}else{
			throw new NameNotFoundException("No manager found given address");
		}
		
		}
			
		
	return null;	
	}
	
		public Manager getManagerNameBymanagerID(int managerId) throws IdNotFoundException {
			
			for (int i=0;  i<manager.length; i++) {
			if(manager[i].managerId==managerId){ 
				
			System.out.println("method By ID start");
			
			
		System.out.println("one parameter :String"+managerId);
			
			
			System.out.println("manager manager Id  macthing the poccess....data ");
			System.out.println(manager[i]);
			
			return manager[i]; 
		}else{
			throw new IdNotFoundException("No manager found given managerId");
		}
		
		}
			
		
	return null;	
	}
	
	
		public Manager getManagerByGender(String gender) throws GenderNotFoundException {
			
			
			for (int i=0;  i<manager.length; i++) {
			if(manager[i].gender.equals(gender)){ 
				
			System.out.println("method By gender start");
		
			System.out.println("method By ID start");
			
			
			System.out.println("one parameter :String"+gender);
				
				
				System.out.println("manager manager gender  macthing the poccess....data ");
				System.out.println(manager[i]);
				
				return manager[i]; 
			}else{
				throw new GenderNotFoundException("No manager found given gender");
			}
			
			}
				
			
		return null;	
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}