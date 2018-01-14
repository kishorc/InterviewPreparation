package com.kru.ck.base.edu;

public class RotateArray {

	public static void main(String[] args) {
		int[] array = {1, 10, 20, 0, 59, 86, 32, 11, 9, 40};
		printArray(array);
		array = reverseArray(array, 3);
		printArray(array);
		
		
	}
	
	static int[] reverseArray(int[] array, int n)
	{
		if(array == null || array.length < 2)
		{
			return array;
		}
		
		reverseArray(array, 0, array.length-1);
		//printArray(array);
		reverseArray(array, 0, n-1);
		//printArray(array);
		reverseArray(array, n, array.length-1);
		
		return array;
	}
	
	static void reverseArray(int[] array, int start, int end)
	{
		int temp;
		while(start < end)
		{
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
	
	private static void printArray(int[] array)
	{
		StringBuffer buffer = new StringBuffer();
		for(int i : array)
		{
			buffer.append(i).append(" ");
		}
		System.out.println(buffer.toString());
	}

}
