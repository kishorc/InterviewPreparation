package com.kru.ck.base.edu;

public class ReverseWordsInString {

	public static void main(String[] args) {
		System.out.println("Test reverseArray : START");
		String str1 = "Hello World";
		System.out.println(str1);
		System.out.println("reverse : " + method1(str1));
		
		String str2 = "The quick brown fox jumped over the lazy dog.";
		System.out.println(str2);
		System.out.println("reverse : " + method1(str2));
		System.out.println("Test reverseArray : END");
		
		System.out.println("Test methodEdu : START");
		str1 = "Hello World";
		System.out.println(str1);
		System.out.println("reverse : " + methodEdu(str1));
		
		str1 = "The quick brown fox jumped over the lazy dog.";
		System.out.println(str1);
		System.out.println("reverse : " + methodEdu(str1));
		System.out.println("Test methodEdu : END");
	}
	
	public static String methodEdu(String str)
	{
		if(str == null || str.length() < 2)
		{
			return str;
		}
		
		char[] array = str.toCharArray();
		reverseArray(array, 0, array.length-1);
		
		int start = 0;
		int end;
		while(true)
		{
			if(start >= array.length)
			{
				break;
			}
			
			if(array[start] == ' ')
			{
				++start;
			}
			
			end = start+1;
			while(end < array.length && array[end] != ' ' )
			{
				++end;
			}
			reverseArray(array, start, end-1);
			start = end;
		}
		
		return new String(array);
	}
	
	
	public static char[] reverseArray(char[] array, int start, int end)
	{
		while(start < end)
		{
			char temp = array[end];
			array[end] = array[start];
			array[start] = temp;
			start++;
			end--;
		}
		
		return array;
	}
	
	
	public static String method1(String str)
	{
		if(str == null || str.length() < 2)
		{
			return str;
		}
		
		
		String[] array = str.split(" ");
		StringBuilder builder = new StringBuilder();
		for(int i=array.length-1;i>-1;i--)
		{
			builder.append(array[i]).append(" ");
		}
		
		return builder.toString().substring(0, builder.length()-1);
	}

}
