package com.vm.training.java.concurrent;

import java.util.Comparator;

public class SortByValue implements Comparator<ConcurrentDemo>
{

	@Override
	public int compare(ConcurrentDemo o1, ConcurrentDemo o2) {
		// TODO Auto-generated method stub
		if(o1.equals(o2))
		{
			return 1;
		}
		else
			return 0;
	}

}
