package com.kru.ck.base.lang.str;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enater the input String  :");
      
        Scanner  sc = new Scanner(System.in);
      
         String input = sc.nextLine();
         
         System.out.println(" Value of the input :" + input);
         duplicateCharecters(input.toCharArray());
      
	}
	
	public static void  duplicateCharecters(char []input){
		
	HashMap<Character, Integer> charMap = new HashMap<Character,Integer>();
	for(char c : input){
	if (charMap.containsKey(c)){
		charMap.put(c, charMap.get(c)+1);
	}	
	else{
		charMap.put(c,1);
	}
	}
	Set<Character> charSet = charMap.keySet();
	for(char ch : charSet){
		if(charMap.get(ch) >1){
	
			System.out.println(ch +" : "+ charMap.get(ch));
		}
	}
	}
}

