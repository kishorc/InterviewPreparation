package com.kru.ck.base;

public class TestFactorial {

	public static void main(String[] args) {
		System.out.println(getFactorialValue(2));
		System.out.println(getFactorialValue(3));
		System.out.println(getFactorialValue(4));
		System.out.println(getFactorialValue(5));
		System.out.println(getFactorialValue(6));
		System.out.println(getFactorialValue(1));
		System.out.println(getFactorialValue(0));
		
		// The below case failing for '125'.
		System.out.println(getFactorialValue(125));
	}
	
	static int getFactorialValue(int n)
	{
		while(n > 1)
		{
			return n * getFactorialValue(n-1);
		}
		
		return n;
	}
	

}
