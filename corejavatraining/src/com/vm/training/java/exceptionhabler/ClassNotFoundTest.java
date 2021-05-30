package com.vm.training.java.exceptionhabler;
import java.io.*;
import java.util.*;
public class ClassNotFoundTest {
	public static void main(String[] args) {
		try {
			Class.forName("HW");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
