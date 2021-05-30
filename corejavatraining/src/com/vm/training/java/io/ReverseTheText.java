package com.vm.training.java.io;

import java.util.*;
import java.io.*;
public class ReverseTheText
{
 public static void main (String [] args)throws IOException
 {
  FileReader fr = new FileReader("Sasi.txt");
  BufferedReader br = new BufferedReader(fr);
  String data;
  while ((data = br.readLine()) != null){
   String[] words = data.split(" ");
   for(String a: words){
    StringBuilder sb=new StringBuilder(a);
    System.out.print(sb.reverse().toString());
   }  
  }
 }
}