package com.kru.ck.base.lang.fis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestFIPredicate {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25);
		
		System.out.println("Printing all numbers:");
		eval(numbers, n -> true);
		
		System.out.println("Printing even numbers:");
		eval(numbers, n -> (n % 2 == 0) );
		
		System.out.println("Printing odd numbers:");
		eval(numbers, n -> (n % 2 == 1) );
		
		Predicate<Integer> predicate1 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return t % 5 == 0 && (t / 5) % 2 == 1;
			}
		};
		
		System.out.println("printing 5s");
		eval(numbers, predicate1);
		eval(numbers, n -> (n % 5 == 0 && ((n / 5) % 2 == 1)) );
		
		System.out.println("==============================================");
		
		List<String> names = Arrays.asList("ram", "sam", "Bheem", "Samba", "Siva", "Kiran", "Janatha");
		
		System.out.println("Print long names : ");
		nameEval(names, n -> n.length() > 4);
		
		System.out.println("print name with 'sam'");
		nameEval(names, n -> n.contains("sam"));

	}
	
	
	static void eval(List<Integer> numbers, Predicate<Integer> predicate)
	{
		for(Integer number : numbers)
		{
			if(predicate.test(number))
			{
				System.out.print(number + " ");
			}
		}
		System.out.println();
		
	}
	
	static void nameEval(List<String> names, Predicate<String> predicate)
	{
		for(String name : names)
		{
			if(predicate.test(name))
			{
				System.out.print(name + " ");
			}
		}
		System.out.println();
	}
	
	static List<Employee> getEmployees()
	{
			List<Employee> employees = new ArrayList<Employee>();
			
			for(int i = 1; i<101;i++)
			{
				employees.add(new Employee());
			}
			
			
			return employees;
	}

}
