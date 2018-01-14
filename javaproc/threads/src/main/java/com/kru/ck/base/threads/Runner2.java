package com.kru.ck.base.threads;

public class Runner2 implements Runnable {
	
	public void run() {

		for (int i = 0; i < 7; i++) {
			System.out.println("Runner 2 : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}