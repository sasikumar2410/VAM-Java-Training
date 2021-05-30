package com.vm.training.java.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ListInsideList {
  public static void main(String[] args) {
    ArrayList array = new ArrayList();
    array.add("Sasi");
    array.add("Shashank");
    array.add("Siva");
    array.add("Kutti");
    array.add("Rocky");
    ArrayList<ArrayList> arraybig = new ArrayList<ArrayList>();
    arraybig.add(array);
    ArrayList array2 = new ArrayList();
    array2.add("Nikhil");
    array2.add("Vasi");
    array2.add("Teja");
    array2.add("Karthik");
    arraybig.add(array2);
    System.out.println(arraybig);
  }
}