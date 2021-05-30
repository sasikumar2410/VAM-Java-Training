package com.vm.training.java.collectionproject;

import java.util.Comparator;

public class WweightSort implements Comparator<Wrestler>{

	@Override
	public int compare(Wrestler o1, Wrestler o2) {
		// TODO Auto-generated method stub
		if(o1.getW_weight()==o2.getW_weight())
			return 0;
		else if(o1.getW_weight()>o2.getW_weight())
			return 1;
		else
		return -1;
	}

}
