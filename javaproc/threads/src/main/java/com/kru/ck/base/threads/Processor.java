package com.kru.ck.base.threads;

public class Processor extends Thread {

	private boolean running = true;

	@Override
	public void run() {

		while (running) {
			System.out.println("hello");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public void shutdown() {
		running = false;
	}
}
