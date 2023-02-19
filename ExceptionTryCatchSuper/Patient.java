package com.xworkz.exceptionapp.hospital;

public class Patient {

	private int patientId;
	private String patientName;
	private String bloodGroup;
	private String gender;
	private int age;
	private String email;


	
	public Patient(int patientId, String patientName,String bloodGroup,String gender,int age, String email) {
		
		this.patientId=patientId;
		this.patientName=patientName;
		this.bloodGroup=bloodGroup;
		this.gender=gender;
		this.age=age;
	    this.email=email;
	
	}
	
	public Patient() {	
	
	}
		
		
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
		}
	
	
	public String getGender() { 
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getEmail() {
		return email; 
	}
	
	
	public void  setEmail(String email) {
		this.email=email;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

	

