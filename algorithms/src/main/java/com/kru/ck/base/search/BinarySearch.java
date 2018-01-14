package com.kru.ck.base.search;

public class BinarySearch<T> implements Search<T> {

	public int doSearch(Object[] array, Object input) {
		
		if(array == null || array.length < 1 || input == null)
		{
			return -1;
		}
		
		if(input instanceof Integer && array instanceof Integer[])
		{
			return doSearch((Integer[]) array, 0, array.length-1, (Integer) input);
		}
		
		return -1;
	}
	
	
	public int doSearch(Integer[] array, int low, int high, Integer input)
	{
		
		int mid = low + (high - low) / 2;
		int val = input.compareTo(array[mid]);
		switch(val)
		{
		case 1:
			return doSearch(array, mid+1, high, input);
		case -1:
				return doSearch(array, low, mid-1, input);
		default:
				return mid;
		}
	}
	
	public int doSearch(int[] arr, int input)
	{
		int low = 0;
		int high = arr.length-1;
		while(low <= high)
		{
			int m = low + (high-low) / 2;
			
			if(input == arr[m])
			{
				return m;
			}else if(input > arr[m])
			{
				low = m + 1;
			}else {
				high = m - 1;
			}
		}
		
		return -1;
	}

}
