package com.kru.ck.base.sort;

import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] a = new int[]{2,5,3,1,7,4};
     int p=0;
     int r = a.length-1;
     System.out.println(quickSort(a,p,r));    
     System.out.println(Arrays.toString(quickSort(a,p,r)));
	}
	
	public static int[] quickSort(int[] a,int p, int r){
		if(p<r){
	      int q =partition(a,p,r);	//pivote_index
	    		  quickSort(a,p,q-1);
	    		  quickSort(a,q+1,r);
		}
	return a;
	}

	public static int partition(int[] a, int p , int r){
		int i= p-1;
		int j= p;
		int pivote_value=a[r];
		for(;j<r;j++){
			if(a[j]<=pivote_value){
				i++;
				int temp=a[i];
				a[i]= a[j];
				a[j]=temp;
			}
		}
		System.out.println(i);
			a[r]= a[i+1];
			a[i+1]=pivote_value;
	
		return i+1;
	}
}
