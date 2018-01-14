package com.kru.ck.base.lang;

public class UserInput {
	
	
	public static class TextInput
	{
		protected StringBuffer buffer = null;
		
		public TextInput()
		{
			buffer = new StringBuffer();
		}
		
		public void add(char c)
		{
			buffer.append(c);
		}
		
		public String getValue()
		{
			return buffer.toString();
		}
	}
	
	public static class NumberInput extends TextInput
	{
		public NumberInput()
		{
			super();
		}
		
		public void add(char c)
		{
			switch(c)
			{
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
						buffer.append(c);
						break;
				default:
						break;
			}
		}
	}

	public static void main(String[] args) {
		TextInput input = new TextInput();
		input.add('c');
		input.add('1');
		input.add('#');
		input.add('@');
		input.add('2');
		input.add('%');
		input.add(' ');
		input.add('_');
		System.out.println("TextInput : " + input.getValue());

		input = new NumberInput();
		input.add('c');
		input.add('1');
		input.add('#');
		input.add('@');
		input.add('2');
		input.add('%');
		input.add(' ');
		input.add('_');
		System.out.println("NumberInput : " + input.getValue());
	}

}
