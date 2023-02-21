package com.xworkz.excptnapp.showrom;

public class Manager {

	
	public int managerId;
	public String managerName;
	public String addres;
	public String qualification;
	public long contactNo;
	public String gender;
	
	public Manager( int managerId,String managerName,String addres,String qualification,long contactNo,String gender) {
		
		System.out.println("Manager object created");
		
		this.managerId= managerId;
		this.managerName = managerName;
		this.addres=  addres;
		this.qualification =qualification;
		this.contactNo =contactNo;
		this.gender =gender;
		
		
	}

	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
				
	}


