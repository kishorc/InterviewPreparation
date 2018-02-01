package com.apple.store.challenge;

public class Encode {

	public static void main(String[] args) {

		System.out.println(encode("hello").toString());
		System.out.println(decode(encode("hello")));
		
	}
	
	private static String encode(String text) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			b.append(c += c + i);
		}
		return b.reverse().toString();
	}
	
	private static String  decode( String text){
		StringBuilder b = new StringBuilder();
		for(int i = text.length()-1; i>0 ; i--){
			char c = text.charAt(i-1);
			b.append(c);
		}
		
		return b.toString();
	}
}
