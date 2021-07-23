package com.ssmtariq;

import java.util.stream.IntStream;

public class Practice5Threads {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
//					System.out.println(Thread.currentThread().getId()+" : "+i);
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
		Runnable runnable2 = ()->{
			IntStream.range(0, 10000).forEach(i->System.out.println(Thread.currentThread().getId()+":"+i));
		};
		Thread thread3 = new Thread(runnable2);
		thread3.start();
	}

}
