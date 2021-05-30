package com.vm.training.java.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("Sasifile.txt");
		pw.write(97);
		pw.write(97);
		
		pw.flush();
		pw.close();
	}

}
