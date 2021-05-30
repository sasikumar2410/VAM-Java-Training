package com.vm.training.java.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> bq=new LinkedBlockingDeque<Integer>();
		Producer producer=new Producer(bq);
		Consumer consumer=new Consumer(bq);
		
		Thread t1=new Thread(producer);
		Thread t2=new Thread(consumer);
		
		
		t1.start();
		t2.start();
	}

}
