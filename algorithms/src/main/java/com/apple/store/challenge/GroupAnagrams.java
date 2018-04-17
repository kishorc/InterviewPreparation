package com.apple.store.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static void main(String[] args) {
	String[] str ={"ate","tae","bat","tab","rat","tar"};
	System.out.println(	groupAnagrams1(str));
	System.out.println(	isAnagram("ate","tae"));
	System.out.println(	isAnagram("ate",""));
	
}
	
	public static List<List<String>> groupAnagrams1(String[] strs) {
	    List<List<String>> result = new ArrayList<List<String>>();
	 
	    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	    for(String str: strs){
	        char[] arr = new char[26];
	        for(int i=0; i<str.length(); i++){
	            arr[str.charAt(i)-'a']++;
	        }
	     
	        String ns = new String(arr);
	      System.out.println(ns.toCharArray());
	        if(map.containsKey(ns)){
	            map.get(ns).add(str);
	        }else{
	            ArrayList<String> al = new ArrayList<String>();
	            al.add(str);
	            map.put(ns, al);
	        }
	    }
	 
	    result.addAll(map.values());
	 
	    return result;
	}
	
	public static boolean isAnagram(String str1, String str2){
		
		//Default value for carecter \u0000  Unicode value  \u0061 --> a
		 char[] arr1 = new char[26];
		 char[] arr2 = new char[26];
		 
		 System.out.println(arr1[0]);
		 for(int i=0; i<str1.length(); i++){
	            arr1[str1.charAt(i)-'a']++;
	        }
		 for(int i=0; i<str2.length(); i++){
	            arr2[str2.charAt(i)-'a']++;
	        }
	     String s1 = new String(arr1);
	     String s2 = new String(arr2);
	     if(!s1.equals(s2)){
	    	 System.out.println("not anagram");
	    	return false;
	     }
	     return true;
	}
}
  

