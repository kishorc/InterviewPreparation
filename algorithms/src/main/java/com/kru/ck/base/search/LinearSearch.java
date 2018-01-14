package com.kru.ck.base.search;

public class LinearSearch {
	
	public int doSearch(Integer[] inArray, Integer number)
	{
		int result = -1;
		if(inArray == null || inArray.length < 1 || number == null)
		{
			return result;
		}
		
		
		for(int i=0, len=inArray.length;i<len;i++)
		{
			if(inArray[i] != null && number.equals(inArray[i]))
			{
				result = i;
				break;
			}
		}
		
		
		return result;
	}
	
	public int doSearch(String[] strArray, String str)
	{
		if(strArray == null || strArray.length < 1 || str == null || str.isEmpty())
		{
			return -1;
		}
		
		int counter=0;
		for(String ival : strArray)
		{
			if(ival.equals(str))
			{
				return counter;
			}
			counter++;
		}
		
		return -1;
	}
	
	public int doSearch(Object[] array, Object input) {
		
		if(array == null || array.length < 1 || input == null)
		{
			return -1;
		}
		
		int index = 0;
		for(Object obj : array)
		{
			if(obj.equals(input))
			{
				return index;
			}
			index++;
		}
		
		return -1;
	}

}
