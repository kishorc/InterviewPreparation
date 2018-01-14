package com.kru.ck.base.oper;

public class SquareRoot {

	public static void main(String[] args) {
		
		System.out.println(squareRoot(25));
		System.out.println(squareRoot(1));
		System.out.println(squareRoot(0));
		System.out.println(squareRoot(16));
		System.out.println(squareRoot(21));
		System.out.println(squareRoot(9));
		System.out.println(squareRoot(82));
	}
	
	static double squareRoot(double input)
	{
		if(input == 0 || input == 1)
		{
			return input;
		}
		if(input > 0)
		{
			return Math.round(root(input, 0, (1+input/2)));
		}else {
			//TODO:: temporary mark.
			return -111;
		}
	}
	
	static final double diffS = 0.00001;
	static double root(double input, double low, double high)
	{
		double mid = (low + high ) / 2;
		double square = mid * mid;
		
		double diff = Math.abs(input - square);
		if(diff <= diffS)
		{
			return mid;
		}else if(square < input)
		{
			return root(input, mid, high);
		}else {
			return root(input, low, mid);
			
		}
	}
	

}
