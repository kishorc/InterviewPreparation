package com.kru.ck.base.lang;

import java.util.GregorianCalendar;

public class TestStringBuffer {

	public static void main(String[] args) {
		System.gc();
		long start = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();
/*		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<100000;i++)
		{
			buffer.append(":").append(i);
			//buffer.append(":" + i);
			buffer.insert(i, "Hi");
		}
*/
		
		
		for(int i=0;i<100000;i++)
		{
			String str = "Hi";
			String str1 = new String("Hi");
		}

		long end = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		
		System.out.println("Time Taken : " + (end - start));
		System.out.println("Memory Used : " + (startMemory - endMemory));
	}

}
