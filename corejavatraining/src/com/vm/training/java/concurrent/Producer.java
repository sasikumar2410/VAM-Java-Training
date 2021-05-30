package com.vm.training.java.concurrent;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	 
	BlockingQueue<Integer> commonqueue;
	
	public Producer(BlockingQueue<Integer> commonqueue) {
		super();
		this.commonqueue = commonqueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("PRODUCER");
			commonqueue.add(i);
			System.out.println("Element added is :"+i);
			System.out.println("=====================");
			
		}
	}

}
