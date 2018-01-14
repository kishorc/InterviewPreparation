package com.kru.ck.base.oper;

public class FindIsValidNumber {

	public static void main(String[] args) {
		System.out.println(isValidNumber("sadf"));
		System.out.println(isValidNumber("-1"));
		System.out.println(isValidNumber("-1234.2"));
		System.out.println(isValidNumber("+12345666"));
		System.out.println(isValidNumber("121212121"));
		System.out.println(isValidNumber("2121.212.21"));
		System.out.println(isValidNumber("121..212"));
		System.out.println(isValidNumber(".212"));
	}
	
	static boolean isValidNumber(String input)
	{
		
		if(input == null || input.isEmpty())
		{
			return false;
		}
		
		int i = 0;
		int len = input.length();
		STATE state = STATE.START;
		if(input.charAt(0) == '+' || input.charAt(0) == '-')
		{
			i++;
		}
		
		while(i < len)
		{
			state = getState(state, input.charAt(i));
			if(state == STATE.UNKNOWN) return false;
			i++;
		}
		
		return true;
	}
	
	static STATE getState(STATE state, char c)
	{
		
		switch(state)
		{
		case START:
		case INTEGER:
				if(c >= '0' && c <= '9')
					return STATE.INTEGER;
				else if(c == '.')
					return STATE.DECIMAL;
				else
					return STATE.UNKNOWN;
		case DECIMAL:
			if(c >= '0' && c <= '9')
				return STATE.DECIMAL;
			else
				return STATE.UNKNOWN;
		}
		
		
		return STATE.UNKNOWN;
	}
	
	static enum STATE {START, INTEGER, DECIMAL, UNKNOWN;};

}
