package com.vm.training.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("Sasi.txt");
		BufferedReader br=new BufferedReader(fr);
		String readlines=br.readLine();
		while(readlines!=null)
		{
			System.out.println(readlines);
			readlines=br.readLine();
		}
	}

}
