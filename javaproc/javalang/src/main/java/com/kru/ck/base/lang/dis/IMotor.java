package com.kru.ck.base.lang.dis;

public interface IMotor {
	
	default void test1()
	{
		System.out.println("IMotor.test1() is default.");
	}

	static void test2()
	{
		System.out.println("IMotor.test2() is static.");
	}

	void test3();
	
}
