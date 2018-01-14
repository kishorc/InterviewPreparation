package com.kru.ck.base.lang;

import java.util.GregorianCalendar;

public class TestStringBuilder {

	public static void main(String[] args) {
		System.gc();
		long start = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			//builder.append(":").append(i);
			builder.append(":" + i);
			builder.insert(i, "Hi");
		}

		long end = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();

		System.out.println("Time Taken : " + (end - start));
		System.out.println("Memory Used : " + (startMemory - endMemory));
	}

}
