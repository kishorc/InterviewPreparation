package com.apple.store.challenge;

public class PrintPatternV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(patternV2(5));
		patternV(5);
	}
	 
	public static void patternV(int height){
		int rowLen = (height-1)*2;
		for (int i=0 ; i<height ; i++){
			int start = i;
			int end = rowLen-i;
			for(int j=0 ; j<= rowLen;j++){
				if(j==end){
					System.out.println("*");
					break;
				}else if(j==start) {
					System.out.print("*");
					
				}else{
					System.out.print(" ");
				}
			}
		}
	}
	
	public static StringBuilder patternV2(int height){
		int col = 2*height +1;
		int  space = 2*height -1;
		StringBuilder stars = new StringBuilder();	
		StringBuilder pattern = new StringBuilder();
		int i=1;
		for(int j=1 ;j<=height; j++){	
			stars.append('*');
		}
		for(int j=1 ; j<=space; j++){
			stars.append(' ');
		}
		
		for(i=1;i<=height;i++){
			pattern.append(stars,0,i);
			pattern.append(stars,height,height+(col-2*i));
			pattern.append(stars,0,i);
			pattern.append("\n");		
		}
		
		return pattern;
	}

}
