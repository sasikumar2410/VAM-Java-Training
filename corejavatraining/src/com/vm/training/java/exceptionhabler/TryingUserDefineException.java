package com.vm.training.java.exceptionhabler;
import java.io.*;
public class TryingUserDefineException {
	public static void main(String[] args)
	{
		try {
			FileOutputStream fos=new FileOutputStream(new File("F:/Personal/valuemomentum/sasi.txt"));
			String s="I am employee in  valuemomentum";
			byte[] by=s.getBytes();
			fos.write(by);
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
    }
}
