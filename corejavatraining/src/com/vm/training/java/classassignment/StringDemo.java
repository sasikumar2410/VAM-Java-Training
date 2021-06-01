package com.vm.training.java.classassignment;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String text="hello javatpoint this is wcc tool";  
		String words[]=text.split("\\s");  
		int length=words.length;//returns total number of words  
		int clength=text.length();//returns total number of characters with space
		System.out.println(text);
		System.out.println(length);
		System.out.println(clength);
	}

}
