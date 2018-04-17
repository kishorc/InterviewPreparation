package com.apple.store.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class IpaddressSortPractice {
	public static void main(String[] args) {
	 List<String> list = Arrays.asList("192.168.0.1","192.168.0.9","192.168.0.2","127.0.0.1","9.9.9.9","1.1.1.1");
    List<String> listPost = Arrays.asList("192.168.0.1:8081","192.168.0.9:8080");
    ipsortiing(list).forEach(e->System.out.println(e));
    ipsortiing1(list).forEach(e->System.out.println(e));
    ipSortingWithPort(listPost).forEach(e->System.out.println(e));
    ipSortingWithPort1(listPost).forEach(e->System.out.println(e));
	}  
	public static List<String> ipsortiing(List<String> list){
		Collections.sort(list, new Comparator<String>(){	 
			public int compare(String s1, String s2){
			String[] update1 = s1.split("\\.");
			String str1 = String.format("%3s.%3s.%3s.%3s", update1[0],update1[1],update1[2],update1[3]);
			String[] update2 = s2.split("\\.");
			String str2 = String.format("%3s.%3s.%3s.%3s", update2[0],update2[1],update2[2],update2[3]);
		    return str1.compareTo(str2);
			}
		});
		
		return list;
	}
	 
	public static List<String> ipsortiing1(List<String> list){
		Collections.sort(list, new Comparator<String>(){	 
			public int compare(String s1, String s2){
			    return toNumeric(s1).compareTo(toNumeric(s2));
			}
		});
		
		return list;
	}
	static Long toNumeric(String ip) {
	    Scanner sc = new Scanner(ip).useDelimiter("\\.");
	    Long l = (sc.nextLong() << 24) + (sc.nextLong() << 16) + (sc.nextLong() << 8)+ (sc.nextLong());
	    System.out.println("printing"+l);
	    sc.close();
	    return l;
	  }
	
	static Long toNumeric1(String ip) {
	    Scanner sc = new Scanner(ip).useDelimiter("\\.|\\:");
	    Long l = (sc.nextLong() << 32) + (sc.nextLong() << 24) + (sc.nextLong() << 16)+ (sc.nextLong()<<8)+(sc.nextLong());
	    System.out.println("printing"+l);
	    sc.close();
	    return l;
	  }

	public static List<String> ipSortingWithPort(List<String> list){
		Collections.sort(list, new Comparator<String>(){
		  public int compare(String s1, String s2){			     
			  String[] str1 = s1.split("\\.|\\:");			  
			  String news1 = String.format("%3s.%3s.%3s.%3s:%4s", str1[0],str1[1],str1[2],str1[3],str1[4]);
			  String[] str2 = s1.split("\\.|\\:");
			  String news2 = String.format("%3s.%3s.%3s.%3s:%4s", str2[0],str2[1],str2[2],str2[3],str2[4]);
			  return news1.compareTo(news2);
			  
		  }
		});
		
		return list;
	}
	
	public static List<String> ipSortingWithPort1(List<String> list){
		Collections.sort(list, new Comparator<String>(){
		  public int compare(String s1, String s2){	     
			  return toNumeric1(s1).compareTo(toNumeric1(s2));
			  
		  }
		});
		
		return list;
	}
	
}
