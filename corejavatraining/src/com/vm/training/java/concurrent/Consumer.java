package com.vm.training.java.concurrent;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	BlockingQueue<Integer> commonqueue;

	public Consumer(BlockingQueue<Integer> commonqueue) {
		super();
		this.commonqueue = commonqueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				System.out.println("CONSUMER");
				System.out.println("Consumer is taking :"+commonqueue.take());
				System.out.println("===================");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
