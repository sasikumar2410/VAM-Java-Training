package com.vm.training.java.oops;

public class PersonAggregation
{
	int personId;
	String personFirstName;
	String personLastName;
	Address addresss;
	public PersonAggregation() {
		// TODO Auto-generated constructor stub
		@SuppressWarnings("unused")
		Address address=new Address();
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonFirstName() {
		return personFirstName;
	}
	public void setPersonFirstName(String personFirstName) {
		this.personFirstName = personFirstName;
	}
	public String getPersonLastName() {
		return personLastName;
	}
	public void setPersonLastName(String personLastName) {
		this.personLastName = personLastName;
	}
	public Address getAddresss() {
		return addresss;
	}
	public void setAddresss(Address addresss) {
		this.addresss = addresss;
	}
	@Override
	public String toString() {
		return "PersonAggregation [personId=" + personId + ", personFirstName=" + personFirstName + ", personLastName="
				+ personLastName + ", addresss=" + addresss + "]";
	}
	
}
