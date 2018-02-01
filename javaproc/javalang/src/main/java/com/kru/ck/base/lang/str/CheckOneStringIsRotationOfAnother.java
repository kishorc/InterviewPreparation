package com.kru.ck.base.lang.str;

public class CheckOneStringIsRotationOfAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isRitationOfanother("javaj2eestruts", "j2eestrutsjava"));

	}

	public static boolean isRitationOfanother(String str1, String str2){
		
		 if(str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty())
		   return false;
		 
		  if(str1 == str2 ||  str1.equals(str2))
		  return true;
		  
		  str1+=str1;
		 return str1.contains(str2);
	}
}
