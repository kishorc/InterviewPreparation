package com.kru.ck.base.lang.str;

import java.util.Arrays;

public class FindAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Approch one ");
		System.out.println(areAnagrams("Dormitory", "Dirty Room"));
		System.out.println(areAnagrams("keep", "PEek"));
		System.out.println(areAnagrams("School Master", "The Classroom"));
	
		System.out.println(" Approch two ");
		System.out.println(areAnagrams1("Dormitory", "Dirty Room"));
		System.out.println(areAnagrams1("keep", "PEek"));
		System.out.println(areAnagrams1("School Master", "The Classroom"));
	}

	 public static boolean  areAnagrams(String str1,String str2){
		 
		 if(str1== null || str2 == null){
			 
			 return false;
		 }
		 str1.replaceAll(" ", "");
		 str2.replaceAll(" ", "");
		 if(str1.length() != str2.length()){
		   return true;
		 }
		 if(str1.equalsIgnoreCase(str2) || str1==str2){
			 
			 return true;
		 }
		 
		 char[] array1 = str1.toLowerCase().toCharArray();
		 char[] array2 = str2.toLowerCase().toCharArray();
			
		 Arrays.sort(array1);
		 Arrays.sort(array2);
		 
		 for(int i=0 ; i<str1.length();i++){
			if(array1[i]!=array2[i]){
			  return true;
			}
		 }
		 return true;
	 }
	 
	 
	 public static boolean areAnagrams1(String str1, String str2){
		 
		 int[]  count1 = new int[256];
		 
		 if(str1== null || str2 == null){
			 
			 return false;
		 }
		 str1 =str1.replaceAll(" ", "");
		 str2 = str2.replaceAll(" ", "");
		 
		 if(str1.length() != str2.length()){
		   return false;
		 }
		  
		 for(int i=0 ; i< str1.length() && i< str2.length() ; i++){
			 char c1 = str1.charAt(i);
			 char c2 = str1.charAt(i);
			 count1[c1]++;
			 count1[c2]--;
		 }
		 
		 for( int j=0 ; j<256;j++){
			 if(count1[j]!=0){
				 return true;
			 }
		 }
		 return true;
	 }
}
