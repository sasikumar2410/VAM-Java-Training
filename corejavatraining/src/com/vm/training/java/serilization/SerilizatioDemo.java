package com.vm.training.java.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizatioDemo implements Serializable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee e=new Employee("VAM5733","GADIPARTHI SASIKUMAR", "VALUEMOMENTUM");
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		 System.out.println("==========Serilization Done==========");
	}

}
