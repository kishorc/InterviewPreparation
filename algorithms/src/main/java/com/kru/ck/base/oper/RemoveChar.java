package com.kru.ck.base.oper;

public class RemoveChar {
	
	public String removeAll(String input, char ch)
	{
		if(input == null || input.isEmpty())
		{
			return null;
		}
		
		return input.replaceAll(Character.toString(ch), "");
	}
	
	public String replaceAll(String input, char oldCh, char newCh)
	{
		if(input == null || input.isEmpty())
		{
			return null;
		}
		
		return input.replaceAll(Character.toString(oldCh), Character.toString(newCh));
	}

}
