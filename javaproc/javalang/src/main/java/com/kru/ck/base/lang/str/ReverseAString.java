package com.kru.ck.base.lang.str;


	public class ReverseAString {

		public static void main(String[] args) {
			System.out.print("HelloRam" + " --> ");
			System.out.println(reverse("HelloRam"));

			System.out.print("Hello Ram" + " --> ");
			System.out.println(reverse("Hello Ram"));
			
			System.out.print("a" + " --> ");
			System.out.println(reverse("a"));
			
			System.out.print(null + " --> ");
			System.out.println(reverse(null));
			
			System.out.print("" + " --> ");
			System.out.println(reverse(""));
		}
		
		
		private static String reverse(String str)
		{
			if(str == null || str.length() < 2)
			{
				return str;
			}
			
			char[] array = str.toCharArray();
			
			int end = array.length-1;
			int start = 0;
			char temp;
			while(start <= end)
			{
				temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				start++;
				end--;
			}
			
			return new String(array);
		}
		

	}



