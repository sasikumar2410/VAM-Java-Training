package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("Today Date"+today);
		
		LocalDateTime todaytime=LocalDateTime.now();
		System.out.println("Today Date and Time :"+todaytime);
		
		
		System.out.println("The day of the Year"+today.getDayOfYear());
		System.out.println("The day of the Month"+today.getDayOfMonth());
		System.out.println("The day of the Week"+today.getDayOfWeek());
	}

}
