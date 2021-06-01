package com.vm.training.java.classassignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.vm.training.java.collectionproject.Wrestler;

public class TestWWE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ArrayList of Wwe type which takes the parameters of wrestler constructor 
		 */
		ArrayList<Wwe> wrestlers = new ArrayList<Wwe>();
		wrestlers.add(new Wwe("John","Cena", 300));
		wrestlers.add(new Wwe("Andre", "The Giant", 265));
		wrestlers.add(new Wwe("Paul", "Bunyan", 173));
		wrestlers.add(new Wwe("Lars", "Sullivan", 142));
		wrestlers.add(new Wwe("Killian", "Dain", 305));
		long count = wrestlers.stream().count();
		System.out.println("No of wrestlers :"+count);
		long  wsum = wrestlers.stream().filter(p->p.getW_weight()>200).map(p->p.getW_weight()).reduce(0,(A,B)->A+B);
		System.out.println("===============================================");
		System.out.println("sum of wrestlers weight > 200 : "+wsum);
		System.out.println("==================================================");
		System.out.println("FirstName of all wrestlers are: ");
		printFirstName(wrestlers).forEach(p->System.out.println(p));
		System.out.println("======================================================");
		System.out.println("wrestlers sorted by firstname :");
		sortbyFirstName(wrestlers).forEach(p->System.out.println(p));

	}
	private static ArrayList<String> printFirstName(ArrayList<Wwe>  list)
	{
		return (ArrayList<String>) list.stream().map(p->p.getFirst_name()).collect(Collectors.toList());

	}
	private static ArrayList<Wwe> sortbyFirstName(List <Wwe> list)
	{
		return (ArrayList<Wwe>) list.stream().sorted(Comparator.comparing(Wwe::getFirst_name)).collect(Collectors.toList());

	}

}


