package com.kru.ck.base.lang;

public class StringOperations {
	
	
	public void test1()
	{
		System.out.println("test1\n--------------");
		String str1 = "str";
		String str2 = "str";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println();
	}
	
	public void test2()
	{
		System.out.println("test2\n--------------");
		String str1 = "str";
		String str2 = new String("str");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println();
	}
	
	public void test3()
	{
		System.out.println("test3\n--------------");
		String str1 = new String("str");
		String str2 = new String("str");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println();
	}
	
	public void test4()
	{
		System.out.println("test4\n--------------");
		String str1 = new String("Str");
		String str2 = new String("str");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println();
	}
	
	public void test5()
	{
		System.out.println("test5\n--------------");
		String str1 = "Str";
		String str2 = "str";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println();
	}
	
	public void test6()
	{
		System.out.println("test6\n--------------");
		String str1 = new String("Str");
		String str2 = new String("str");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equalsIgnoreCase(str2) : " + (str1.equalsIgnoreCase(str2)));
		System.out.println();
	}
	
	public void test7()
	{
		System.out.println("test7\n--------------");
		String str1 = "Str";
		String str2 = "str";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equalsIgnoreCase(str2) : " + (str1.equalsIgnoreCase(str2)));
		System.out.println();
	}

	public static void main(String[] args) {
		StringOperations obj = new StringOperations();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		obj.test6();
		obj.test7();
	}

}
