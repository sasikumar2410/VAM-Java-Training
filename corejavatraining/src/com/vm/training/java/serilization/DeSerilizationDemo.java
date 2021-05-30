package com.vm.training.java.serilization;
import java.io.*;
public class DeSerilizationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e=(Employee) ois.readObject();
		System.out.println(e.id+" "+e.name+" "+e.comapani);
	}

}
