package com.vm.training.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("F:\\\\Personal\\\\valuemomentum\\\\Assignments\\\\bufferclass.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Id"+" "+"Name"+" "+"Batch");
		bw.newLine();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter gthe number how many time does data emter in the file :");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			String id=sc.next();
			String name=sc.next();
			String dpt=sc.next();
			bw.write(id);
			bw.write(" ");
			bw.write(name);
			bw.write(" ");
			bw.write(dpt);
			bw.newLine();
			bw.flush();
			
		}
		System.out.println("data sent to .txt file");
		
	}

}
