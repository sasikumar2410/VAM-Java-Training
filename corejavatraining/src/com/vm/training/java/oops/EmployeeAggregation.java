package com.vm.training.java.oops;

public class EmployeeAggregation
{
	int employeId;
	String empFirstName;
	String empLastName;
	Address addresss;
	
	
	//generating the getters and setters for datafeilds of the classmembers
	public int getEmployeId() {
		return employeId;
	}
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public Address getAddresss() {
		return addresss;
	}
	public void setAddresss(Address addresss) {
		this.addresss = addresss;
	}
	
	
	//tostring method to print the data of Empoyeedetails
	@Override
	public String toString() {
		return "EmployeeAggregation [employeId=" + employeId + ", empFirstName=" + empFirstName + ", empLastName="
				+ empLastName + ", addresss=" + addresss + "]";
	}
	

	
}
