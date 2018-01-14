package com.kru.ck.base.lang.dis;

public interface IMotorVehicle {
	
	default void print()
	{
		System.out.println("I am IMotorVehicle::print()");
	}
	
	static void write()
	{
		System.out.println("I am IMotorVehicle::write()");
	}

}
