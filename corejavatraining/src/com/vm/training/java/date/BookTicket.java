package com.vm.training.java.date;

import java.util.*;
import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.io.*;
import java.security.cert.LDAPCertStoreParameters;
public class BookTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today=LocalDate.now();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date to be booked in format(yyyy-mm-dd)");
		String str=sc.nextLine();
		LocalDate ld=LocalDate.parse(str);

		if(ld.isAfter(today))
		{
			System.out.println("The ticket is booked successfully on "+ld);
		}
		else
		{
			System.out.println("We can not book your ticket");
		}
	}

}
