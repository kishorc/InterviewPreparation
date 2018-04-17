package com.apple.store.challenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   String input = scanner.nextLine(); 
		    System.out.println(isPangram(input) ? "pangram" : "not pangram"); 
		}

		static boolean isPangram(String input) {
		    boolean isPangram = false;

		    if(input == null || input.length() < 26) {
		        return isPangram;
		    }

		    input = input.toLowerCase();
		    char [] charArray = input.toCharArray();
		    Set<Character> charSet = new HashSet<>();
		    for(char c : charArray) {
		        if(Character.isLetter(c) && (!Character.isWhitespace(c))) {
		            charSet.add(c);
		        }
		    }
		    if (charSet.size() == 26) {
		        isPangram = true;
		    }
		    return isPangram;
		}
		
		static int ispangram1(String sentence){
			sentence = sentence.toUpperCase();
	        sentence = sentence.replaceAll("[^A-Z]", "");

	        char[] chars = sentence.toCharArray();

	        Set<Character> set = new HashSet<Character>();

	        for( int i = 0; i < chars.length; i++ ) set.add(chars[i]);
            return set.size();
		}
		
}
