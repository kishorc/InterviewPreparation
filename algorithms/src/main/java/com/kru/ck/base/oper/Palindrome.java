package com.kru.ck.base.oper;

public class Palindrome {

	public boolean isPalindrome(String str) {

		if(str == null || str.isEmpty())
		{
			return false;
		}
		
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		return (str.equalsIgnoreCase(builder.toString()));
	}


	public boolean isPalindrome1(String str) {

		if(str == null || str.isEmpty())
		{
			return false;
		}
		
		int len = str.length();
		for(int i=0,mid=len/2;i<mid;i++)
		{
			if(str.charAt(i) != str.charAt(len-i-1))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isPalindrome(int input) {
		return isPalindrome1(String.valueOf(input));
	}
	
}
