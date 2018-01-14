package com.kru.ck.base.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Tester {

	public static void main(String[] args) {
		
		Java8Tester obj = new Java8Tester();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add("five");
		
		System.out.println(list1);
		obj.sort7(list1);
		System.out.println(list1);
		System.out.println();
		
		list1.add("six");
		list1.add("seven");
		list1.add("eight");
		list1.add("nine");
		list1.add("ten");
		
		System.out.println(list1);
		obj.sort8(list1);
		System.out.println(list1);
		
		System.out.println("===========");
		
		obj.print8(list1);
		System.out.println("===========");
		
		obj.print8A(list1);
	}
	
	public void sort7(List<String> list)
	{
		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}
	
	public void sort8(List<String> list)
	{
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
	}
	
	public void print7(List<String> list)
	{
		for(String str : list)
		{
			System.out.println(str);
		}
	}
	
	public void print8(List<String> list)
	{
		list.forEach(System.out::print);
	}
	
	public void print8A(List<String> list)
	{
		list.forEach(this::print);
	}
	
	private void print(String str)
	{
		System.out.print(str + " ");
	}

}
