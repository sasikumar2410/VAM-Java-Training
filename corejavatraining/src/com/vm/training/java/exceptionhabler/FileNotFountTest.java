package com.vm.training.java.exceptionhabler;
import java.io.*;
public class FileNotFountTest {
	public static void main(String[] args) {
		File file=new File("F:/Personal/valuemomentum/Assignments/cafeteriaproject.txt");
		FileInputStream fileinput=null;
		try {
			fileinput=new FileInputStream(file);
			while(fileinput.read()!=-1)
			{
				System.out.println(fileinput.read());
			}
	}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				fileinput.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
