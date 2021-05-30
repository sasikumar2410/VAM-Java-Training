package com.vm.training.java.io;

import java.io.*;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("Sasi.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("i am sasi");
		fw.write("\n");
		fw.write("i am employee at valuemomentum");
		fw.flush();
		fw.close();
		System.out.println("data was stored in file sasi.txt");
	}

}
