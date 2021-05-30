package com.vm.training.java.newfuture;

import java.util.function.Function;
import java.util.function.Predicate;

public class InBuitlFunctional {

	public static void main(String[] args) {
		Predicate<String> p1=(v1)->v1.startsWith("a");
		System.out.println(p1.test("Sasi"));
		
		Predicate<Integer> p2=(v1)->v1>2;
		System.out.println(p2.test(5));
		
		
		
		Function<String , String> f1=(var)->var.concat(" To Valuemomentum");
		System.out.println(f1.apply("Hello Welcome"));
	}

}
