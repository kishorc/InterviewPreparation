package com.kru.ck.base.lang.str;

import java.util.HashMap;
import java.util.Scanner;

public class CharcountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the input content : ");
         Scanner sc = new Scanner(System.in);
         String  input = sc.nextLine();
         System.out.println(" Input string : ");
         System.out.println(charCount(input));
	}

	public static HashMap<Character, Integer>  charCount(String input){
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		char[]  chArray = input.toCharArray();
		for(char c  : chArray){
			if(countMap.containsKey(c)){
				countMap.put(c,countMap.get(c)+1);
			}else{
				countMap.put(c,1);
			}
		}
		
		return countMap;
		
	}
}
