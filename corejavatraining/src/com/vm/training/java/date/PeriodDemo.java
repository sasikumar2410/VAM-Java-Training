package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate tillDate=LocalDate.now();
		LocalDate bornDate=LocalDate.of(1999, 10, 24);
		Period period=Period.between(bornDate,tillDate);
		System.out.println("Year :"+period.getYears()+" "+"Months :"+period.getMonths()+" "+" Days :"+period.getDays());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Bday");
		String str=sc.nextLine();
		LocalDate borndate=LocalDate.parse(str);
		Period period1=Period.between( borndate,tillDate);
		System.out.println("Year :"+period1.getYears()+" "+"Months :"+period1.getMonths()+" "+" Days :"+period1.getDays());
		
	}

}
