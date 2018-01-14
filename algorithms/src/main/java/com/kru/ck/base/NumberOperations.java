package com.kru.ck.base;

public class NumberOperations {

	
	public int reversNumber(int number)
	{
		int result = 0;
		boolean isNeg = number < 0;
		number = isNeg ? number * -1 : number;
		
		// input = 1234
		//output = 4321
		// 1234 = 1000 -1, 100 - 2, 10 - 3, 1 - 4
		while(number != 0)
		{
			result = (result * 10) + (number % 10);
			// 0 * 10  + 4 =  4
			// 4 * 10 + 3 = 43
			// 43 * 10 + 2 = 432
			// 432 * 10 + 1 = 4321
			
			number /= 10;
			// 123
			// 12
			// 1
			// 0
		}
		
		return isNeg ? result * -1 : result;
		
	}

}
