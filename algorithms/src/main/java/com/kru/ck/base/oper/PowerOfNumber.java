package com.kru.ck.base.oper;

public class PowerOfNumber {

	public static void main(String[] args) {
		System.out.println(getPower(3, 5));
		System.out.println(getPower(3, 8));
		
		System.out.println();
		System.out.println(findPower(3, 5));
		System.out.println(findPower(3, 8));
		System.out.println(findPower(3, -2));
		System.out.println(findPower(3, -1));
	}
	
	

	static double getPower(int x, int n) {
		double result = x;
		for(int i=1;i<n;i++)
		{
			result *= x;
		}
		
		return result;
	}
	
	static double findPower(int x, int n)
	{
		boolean isNegative  = false;
		if(n < 0)
		{
			isNegative = true;
			n *= -1;
		}
		
		double result = power(x, n);
		
		if(isNegative)
		{
			result = 1 / result;
		}
		
		return result;
	}
	
	static double power(double x, int n)
	{
		if(n == 0) return 1;
		if(n == 1) return x;
		
		double result = power(x, n/2);
		if(n % 2 == 0)
		{
			return result * result;
		}else {
			return x * result * result;
		}
		
	}
}
