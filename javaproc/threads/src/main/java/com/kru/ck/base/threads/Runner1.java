package com.kru.ck.base.threads;

public class Runner1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 7; i++) {
			System.out.println("Runner 1 : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
