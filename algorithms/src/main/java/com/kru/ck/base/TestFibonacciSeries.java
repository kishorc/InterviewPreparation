package com.kru.ck.base;

public class TestFibonacciSeries {

	public static void main(String[] args) {
		printArray(getFiboncacci(1));
		printArray(getFiboncacci(2));
		printArray(getFiboncacci(3));
		printArray(getFiboncacci(4));
		printArray(getFiboncacci(5));
		printArray(getFiboncacci(6));
		printArray(getFiboncacci(7));
		
		printArray(getFiboncacci(15));
		
		printArray(getFiboncacci(35));

	}
	
	static int[] getFiboncacci(int number)
	{
		
		if (number < 1) return new int[0];
		if (number == 1) return new int[] {1};
		
		if (number == 2) return new int[] {1, 1};
		
		int[] arr = new int[number];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2;i<number; i++)
		{
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr;
		
	}
	
	static void printArray(int arr[])
	{
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
