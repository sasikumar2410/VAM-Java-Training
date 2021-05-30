package com.vm.training.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("F:\\Personal\\valuemomentum\\Assignments\\Sasi_BankAssignment.txt");
		FileReader fr=new FileReader(f);
		//System.out.println(fr.read());
		int readchar=fr.read();
		while(readchar!=-1)
		{
			System.out.println((char)readchar);
			readchar=fr.read();
		}
	}

}
