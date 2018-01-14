package com.kru.ck.base.edu;

public class MoveZerosToLeftInArray {

	public static void main(String[] args) {
		int[] array = {0, 1, 100, 10, 0, 20, 0, 59, 63, 0,88, 0};
		printArray(array);
		array = moveZerosToLeft(array);
		printArray(array);
	}
	
	static int[] moveZerosToLeft(int[] array)
	{
		if(array == null || array.length < 2)
		{
			return array;
		}
		
		int readIndex = array.length -1;
		int writeIndex = readIndex;
		
		while(readIndex >= 0)
		{
			if(array[readIndex] != 0)
			{
				array[writeIndex] = array[readIndex];
				writeIndex--;
			}
			readIndex--;
		}
		
		while(writeIndex >= 0)
		{
			array[writeIndex] = 0;
			writeIndex--;
		}
		
		return array;
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
