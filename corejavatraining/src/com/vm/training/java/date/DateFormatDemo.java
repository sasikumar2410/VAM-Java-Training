package com.vm.training.java.date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class DateFormatDemo {
 public static void main(String[] args) {
  LocalDate today=LocalDate.now();
  System.out.println("today :"+today);
  DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
  DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyyy MM dd");
  DateTimeFormatter dtfull=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
  DateTimeFormatter dtme=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
  DateTimeFormatter dtshort=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
  String afterFormat=today.format(dtf);
  System.out.println("date after formate :"+afterFormat);
  String afterFormat2=today.format(dtf2);
  System.out.println("date after formate :"+afterFormat2);
  String fulldate=today.format(dtfull);
  System.out.println("full date :"+fulldate);
  String mediumdate=today.format(dtme);
  System.out.println("full date :"+mediumdate);
  String shortdate=today.format(dtshort);
  System.out.println("full date :"+shortdate);
 }
}
