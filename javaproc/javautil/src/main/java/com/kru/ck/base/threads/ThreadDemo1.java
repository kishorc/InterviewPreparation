package com.kru.ck.base.threads;

public class ThreadDemo1 {

	public static void main(String[] args) {
		
		
		Runner1 runner1 = new Runner1();
		runner1.start();
		
		Runner2 runner2 = new Runner2();
		Thread t2 = new Thread(runner2);
		t2.start();
		
		
		Thread t3 = new Thread(new Runnable() {
			
			public void run() {
				
				for(int i=0;i<7;i++)
				{
					System.out.println("Runner 3 : " + i);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		t3.start();

	}

}



