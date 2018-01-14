package com.kru.ck.base.lang.str;

import java.util.Arrays;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "he ll o ";
		System.out.println(str);
		
		//case 1:
		System.out.println(str.replaceAll(" ", ""));
		
		// case 2:
		System.out.println(removeSpces(str));
		
		// case 3:
		System.out.println(removeWhiteSpaces(str));
	}
	
	private static String removeSpces(String str)
	{
		if(str == null || str.isEmpty())
		{
			return str;
		}
		
		char[] array = str.toCharArray();
		int len = 0;
		for(int i=0,l=array.length;i<l;i++)
		{
			if(array[i] != ' ')
			{
				len++;
			}
		}
		char[] result = new char[len];
		len=0;
		for(int i=0,l=array.length;i<l;i++)
		{
			if(array[i] != ' ')
			{
				result[len++] = array[i]; 
			}
		}
		
		return new String(result);
	}
	
	private static String removeWhiteSpaces(String str)
	{
		if(str == null || str.isEmpty())
		{
			return str;
		}
		
		char[] array = str.toCharArray();
		int rindex = 0;
		int windex = 0;
		
		while(rindex < array.length)
		{
			if(array[rindex] != ' ')
			{
				array[windex] = array[rindex];
				windex++;
			}
			rindex++;
		}
		
		return new String(Arrays.copyOf(array, windex));
	}

}
