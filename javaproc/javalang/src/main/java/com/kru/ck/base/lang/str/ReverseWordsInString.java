package com.kru.ck.base.lang.str;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Callling ....ReverseWordsInString");
		 
	  System.out.println("out put   :"+reverseWords("Hello World"));
	}
	
	public static String reverseWords(String str){
		
		if(str.length() < 2 || str == null)
		 return str;
		
		char[] array = str.toCharArray();
		reverse(array,0,array.length -1);
		int start = 0;
		int end;
		while(true){
			if(start >=array.length-1){
				break;
			}
			if(array[start] ==' '){
				start++;
			}
			end= start+1;
			while(end<array.length && array[end]!=' '){
				++end;
			}
			reverse(array,start,end-1);
			start=end;
		}

		return new String(array);
		
	}
	
public static void	reverse(char[] array,int start , int end){
		char temp;
	 while(start<end){
		  temp=array[end];
		  array[end]= array[start];
		  array[start]= temp;
		  --end;
		  ++start;
	  }
	
	}

}
