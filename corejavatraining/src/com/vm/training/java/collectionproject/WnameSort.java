package com.vm.training.java.collectionproject;

import java.util.Comparator;

public class WnameSort implements Comparator<Wrestler> {

	@Override
	public int compare(Wrestler o1, Wrestler o2) {
		// TODO Auto-generated method stub
		return o1.getW_name().compareTo(o2.getW_name());
	}

}
