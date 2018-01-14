package com.kru.ck.base;

import java.util.Random;

public class TestPalindrome {

	public static void main(String[] args) {
		
		Random random = new Random();

		for(int i =0;i<10;i++)
		{
			System.out.print(random.nextInt(i + 1) + " ");
		}
		System.out.println();

		System.out.println(isPalindrome("121"));
		System.out.println(isPalindrome("1212"));
		System.out.println(isPalindrome("12344321"));
		System.out.println(isPalindrome(String.valueOf(123456)));
		System.out.println(isPalindrome(String.valueOf(123454321)));
	}
	
	
    public static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        
        for(int i =0, len=arr.length-1;i<=len;i++)
        {
        		if(arr[i] != arr[len-i])
        		{
        			return false;
        		}
        }
        
        
        return true;
    }

}
