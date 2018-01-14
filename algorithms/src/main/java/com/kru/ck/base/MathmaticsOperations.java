package com.kru.ck.base;

import java.util.ArrayList;
import java.util.List;

public class MathmaticsOperations {
	
	public static void printPrimes(int limit)
	{
		if(limit < 1)
		{
			return;
		}
		
		if(limit == 1)
		{
			System.out.println(2);
			return;
		}
		
		List<Long> primes = new ArrayList<Long>();
		primes.add(2l);
		long base = 3;
		
		while(primes.size() < limit)
		{
			boolean isPrime = true;
			for(int i =2;i<base;i++)
			{
				if((base % i) == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				primes.add(base);
			}
			base++;
		}
		
		System.out.println(primes);
	
	}

	public static void main(String[] args) {
		printPrimes(0);
		printPrimes(1);
		printPrimes(2);
		printPrimes(6);
		printPrimes(15);
	}

}
