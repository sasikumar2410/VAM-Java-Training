package com.vm.training.java.io;

import java.io.File;
import java.io.IOException;

public class CreateDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("Sasi.txt");
		File f2=new File("F:\\Personal\\valuemomentum\\Assignments\\Sasi_BankAssignment.txt");
		if(f2.exists())
		{
			System.out.println("file is already");
		}
		else
		{
			System.out.println("file is not present");
			f2.createNewFile();
			System.out.println("File is created");
		}
	}

}
