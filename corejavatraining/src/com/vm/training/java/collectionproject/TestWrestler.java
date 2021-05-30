package com.vm.training.java.collectionproject;

import java.util.ArrayList;
import java.util.Collections;

public class TestWrestler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Wrestler> al=new ArrayList<Wrestler>();
		al.add(new Wrestler("John cena",125,(float) 6.2));
		al.add(new Wrestler("Rock",115,(float) 6.3));
		al.add(new Wrestler("Batista",1355,(float) 6.2));
		al.add(new Wrestler("Undertaker",125,(float) 6.2));
		for(Wrestler w:al)
		{
			System.out.println(w);
		}
		
		
		System.out.println("=======After Sorting======");
		Collections.sort(al,new WnameSort());
		for(Wrestler w:al)
		{
			System.out.println(w);
		}
		
		
		
		System.out.println("==========After Sorting by Height=======");
		Collections.sort(al, new HeightSort());
		for(Wrestler w:al)
		{
			System.out.println(w);
		}
		
		
		
		
		System.out.println("======After sorting by Weight========");
		Collections.sort(al, new WweightSort());
		for(Wrestler w:al)
		{
			System.out.println(w);
		}
		
	}

}
