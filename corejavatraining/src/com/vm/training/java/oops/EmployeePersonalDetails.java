package com.vm.training.java.oops;

public class EmployeePersonalDetails extends EmployeeDetails
{
	String nationality;

	public EmployeePersonalDetails(int i, String empName, String dpt, String email, String phno, String add,
			String nationality) {
		super(i, empName, dpt, email, phno, add);
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "EmployeePersonalDetails [nationality=" + nationality + ", email=" + email + ", phno=" + phno + ", add="
				+ add + ", i=" + i + ", empName=" + empName + ", dpt=" + dpt + "]";
	}
	
	public static void main(String[] sasi)
	{
		EmployeePersonalDetails epd=new EmployeePersonalDetails(5733, "sasi", "D&c", "a@b.com", "12346", "Tvr","indian");
		System.out.println(epd);
	}
}
