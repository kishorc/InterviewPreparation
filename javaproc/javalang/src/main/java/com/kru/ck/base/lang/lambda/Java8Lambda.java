package com.kru.ck.base.lang.lambda;

public class Java8Lambda {

	public static void main(String[] args) {

		test1();
		System.out.println("------");
		
		test2();
		System.out.println("------");
		
		test3();
		System.out.println("------");
	}
	
	private static void test3()
	{
		Maths square = (a) -> a * a;
		
		Maths doubled = (a) -> a + a;
		
		System.out.println(square.calculate(2));
		System.out.println(doubled.calculate(5));
	}

	private static void test2() {

		GreetingService service1 = (message) -> System.out.println("Hello " + message);

		GreetingService service2 = message -> System.out.println("How are you " + message);

		service1.sayMessage("Ram");
		service2.sayMessage("Bheem");
	}

	private static void test1() {

		MathOperation addition = (a, b) -> a + b;

		MathOperation subtraction = (int a, int b) -> a - b;

		MathOperation multiplication = (int a, int b) -> a * b;

		MathOperation division = (int a, int b) -> a / b;

		System.out.println(operate(10, 5, addition));
		System.out.println(operate(10, 5, subtraction));
		System.out.println(operate(10, 5, multiplication));
		System.out.println(operate(10, 5, division));
	}

	private static int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
