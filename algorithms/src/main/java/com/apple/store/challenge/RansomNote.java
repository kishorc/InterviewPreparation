package com.apple.store.challenge;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mgz ="happy holidayse";
		String note= "apple";
       if( findRansamNote1( mgz, note)){
    	System.out.println(" Magazine Contains Ransome");   
       }else{
    	System.out.println(" Magazine not Contains Ransome");
       }
	    
	}
      public static boolean findRansamNote1(String mgz,String note){
		int[] count = new int[256];

				for(int i=0 ;i <mgz.length();i++){
    	           char ch = mgz.charAt(i);
    	           count[ch]++;
				}
				for(int j=0 ; j<note.length(); j++){
					char ch = note.charAt(j);
					count[ch]--;
					if(count[ch]<0){
						return false;
					}
				}
    	  return true;
    	  
      }
}
