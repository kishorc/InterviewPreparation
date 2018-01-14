package com.kru.ck.base.oper;

import java.io.*;
import java.util.*;

public class MaximumSingleSellProfitOfAStock {

	public static void main(String[] args) {
		int[] arr1 = {12, 5, 9, 19};
		findProfit(arr1);
		System.out.println();
		
		int[] arr2 = { 7, 4, 3, 5, 6, 1, 2, 19 };
		findProfit(arr2);
		System.out.println();
	}
	
	static void findProfit(int[] arr)
	{
		if(arr == null || arr.length < 2)
		{
			return;
		}
		
		int cprofit = Integer.MIN_VALUE;
		int cbuy = arr[0];
		int gsell = arr[1];
		int gprofit = gsell - cbuy;
		
		for(int i=1,len=arr.length;i<len;i++)
		{
			cprofit = arr[i] - cbuy;
			if(cprofit > gprofit)
			{
				gprofit = cprofit; 
				gsell = arr[i];
			}
			if(arr[i] < cbuy)
			{
				cbuy = arr[i];
			}
		}
		
		System.out.println("buy value : " + (gsell - gprofit));
		System.out.println("sell value : " + gsell);
		System.out.println("profit : " + gprofit);
	}
	
	static void findDays(int[] arr)
	{
		if(arr == null || arr.length < 2)
		{
			return;
		}
		
		int cprofit = -1;
		int cbuy = arr[0];
		int gsell = arr[1];
		int gprofit = gsell-cbuy;
		
		for(int i=1,len=arr.length;i<len;i++)
		{
			cprofit = arr[i] - cbuy;
			if(cprofit > gprofit)
			{
				gprofit = cprofit; 
				gsell = arr[i];
			}
			if(arr[i] < cbuy)
			{
				cbuy = arr[i];
			}
		}
		
		System.out.println("buy value : " + (gsell - gprofit));
		System.out.println("sell value : " + gsell);
		System.out.println("profit : " + gprofit);
	}
	
	

}