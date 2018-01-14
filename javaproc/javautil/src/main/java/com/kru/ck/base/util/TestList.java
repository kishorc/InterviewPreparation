package com.kru.ck.base.util;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		
		for(String str : list1)
		{
			System.out.println(str);
		}
		System.out.println("1-----");
		
		list1.add("Sam");
		for(String str : list1)
		{
			System.out.println(str);
		}
		System.out.println("2-----");
		
		list1 = null;
		
		List<String> list2  = (List<String>) new ArrayList<String>();;
		System.out.println(list2);
		for(String str : list2)
		{
			System.out.println(str);
		}
		

	}

}
