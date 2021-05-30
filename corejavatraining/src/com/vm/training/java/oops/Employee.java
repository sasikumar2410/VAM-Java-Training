package com.vm.training.java.oops;

public class Employee {
	public int emId;
	public String empName;
	public String dpt;
//	public Employee(int empId,String empName,String dpt){
//		this.emId=empId;
//		this.empName=empName;
//		this.dpt=dpt;
//	}
//	public Employee(int emId) {
//		super();
//		this.emId = emId;
//	}
//	public Employee(int emId, String empName) {
//		super();
//		this.emId = emId;
//		this.empName = empName;
//	}
//	void show()
//	{
//		display();
//	}
//	void show1()
//	{
//		display1();
//	}
//	void show2()
//	{
//		display2();
//	}
//	void show3()
//	{
//		display3();
//	}
//public Employee() {
//		super();
//	}
//private void display()
//{
//	System.out.print(emId+" "+empName+" "+dpt);
//}
//private void display1()
//{
//	System.out.print(emId);
//}
//private void display2()
//{
//	System.out.print(emId+" "+empName);
//}
//private void display3()
//{
//	System.out.print(emId+" "+empName+" "+dpt);
//}
	
	
	
	
	//getter and setter methods were generated
	public int getEmId() {
		return emId;
	}
	public Employee() {
	super();
}
	public void setEmId(int emId) {
		this.emId = emId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
}
