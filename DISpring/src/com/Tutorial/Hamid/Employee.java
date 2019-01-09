package com.Tutorial.Hamid;

public class Employee {
	// Attributes
	int eid;
	String ename;
	Address address;
	
	//Constructor
	public Employee() {
		System.out.println("---Object Created--");
	}
	
	// Constructor Injection 
	public Employee(Address address) {
		
		this.address = address;
	}
	
	//Method
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	
	//Setter Injection 
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//Display
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}	
	

}
