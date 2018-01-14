package com.apple.store.challenge;

import java.util.HashSet;
import java.util.Set;

public class AOSChallengeImpl implements AOSChallenge {
	
	public static void main(String[] args) {
		
		//productOfOtherPositions test:
		AOSChallengeImpl impl = new AOSChallengeImpl();
		
		System.out.println("productOfOtherPositions Test : ");
		int[] input = {6, 3, 2};
		int[] result = impl.productOfOtherPositions(input);
		printArray(input);
		printArray(result);
		System.out.println();
		input = new int[] {6, 9, 2, 6};
		result = impl.productOfOtherPositions(input);
		printArray(input);
		printArray(result);
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("reverseWordsInSentence Test : ");
		String inputStr = "The dog runs REALLY fast.";
		System.out.println(inputStr);
		System.out.println(impl.reverseWordsInSentence(inputStr));
		System.out.println();
		inputStr = "dog means cat";
		System.out.println(inputStr);
		System.out.println(impl.reverseWordsInSentence(inputStr));
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("replaceMultiplesOf3And5WithText Test : ");
		System.out.println(impl.replaceMultiplesOf3And5WithText(150));
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("buildHistogram Test : ");
		input = new int[]{6,9,8,6,8};
		printArray(input);
		System.out.println(impl.buildHistogram(input));
		System.out.println();
		input = new int[]{1, 2, 3, 4, 56, 1, 2, 4, 5, 56, 1, 2, 5};
		printArray(input);
		System.out.println(impl.buildHistogram(input));
		System.out.println("------------------");
		System.out.println();
		
	}

	@Override
	public int[] productOfOtherPositions(int[] input) {
		if(input == null || input.length < 2)
		{
			return input;
		}
		
		int len = input.length;
		int[] result = new int[len];
		int temp = 1;
		
		for(int i=0;i<len;i++)
		{
			result[i] = 1;
		}
		
		
		for(int i=0;i<len;i++)
		{
			result[i] = temp;
			temp *= input[i];
		}
		temp = 1; 
		
		for(int i=len-1;i>-1;i--)
		{
			result[i] *= temp;
			temp *= input[i];
		}
		 
		return result;
	}

	@Override
	public String reverseWordsInSentence(String str) {
		if(str == null)
		{
			return str;
		}
		
		boolean hasPeriod = false;
		if(str.endsWith("."))
		{
			hasPeriod = true;
		}
		
		char[] array = str.toCharArray();
		int len = hasPeriod ? array.length-1 : array.length;
		reverse(array, 0, len-1);
		
		int start = 0;
		int end;
		while(true)
		{
			if(start >= len)
			{
				break;
			}
			
			if(array[start] == ' ')
			{
				++start;
			}
			
			end = start+1;
			while(end < len && array[end] != ' ' )
			{
				++end;
			}
			reverse(array, start, end-1);
			start = end;
		}
		
		return String.valueOf(array);
	}

	@Override
	public String replaceMultiplesOf3And5WithText(int max) {
		StringBuffer buffer = new StringBuffer();
		
		for(int i =1;i<=max;i++)
		{
			if(i % 15 == 0)
			{
				buffer.append("AppleOnline").append("\n");
			}else if(i % 3 == 0)
			{
				buffer.append("Apple").append("\n");
			}else if(i % 5 == 0) {
				buffer.append("Online").append("\n");
			}else {
				buffer.append(i).append("\n");
			}
		}
		return buffer.toString();
	}

	@Override
	public Set<HistogramElement> buildHistogram(int[] array) {
		
		if(array == null || array.length == 0)
		{
			return null;
		}
		
		Set<HistogramElement> set = new HashSet<HistogramElement>();
		for(int input : array)
		{
			updateSet(set, input);
		}
		
		return set;
	}
	
	private void updateSet(Set<HistogramElement> set, int input)
	{
		boolean isNotExist = true;
		for(HistogramElement obj : set)
		{
			
			if(obj.getValue() == input)
			{
				((HistogramElementImpl)obj).count = obj.getCount()+1;
				isNotExist = false;
			}
		}
		
		if(isNotExist) {
			set.add(new HistogramElementImpl(input, 1));
		}
		
	}
	
	class HistogramElementImpl implements HistogramElement
	{
		int value;
		int count;
		
		public HistogramElementImpl(int value, int count)
		{
			this.value = value;
			this.count = count;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public int getCount() {
			return count;
		}
		
		@Override
		public String toString() {
			StringBuffer buffer = new StringBuffer();
			buffer.append("[").append(value).append(",").append(count).append("]");
			return buffer.toString();
		}
		
	}
	
	
	private static void printArray(int[] array)
	{
		StringBuffer buffer = new StringBuffer();
		for(int i : array)
		{
			buffer.append(i).append(" ");
		}
		System.out.println(buffer.toString());
	}
	
	
	private char[] reverse(char[] input, int low, int high)
	{
		if(input == null || input.length < 2)
		{
			return input;
		}
		
		while(low < high)
		{
			char temp = input[low];
			input[low] = input[high];
			input[high] = temp;
			low++;
			high--;
		}
		
		return input;
	}

}
