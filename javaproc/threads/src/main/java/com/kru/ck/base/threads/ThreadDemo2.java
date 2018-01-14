package com.kru.ck.base.threads;

import java.util.Scanner;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Processor proc = new Processor();
		proc.start();

		System.out.println("Enter input : ");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		proc.shutdown();
	}

}
