package com.kru.ck.base.lang.dis;

public class NewVehicle implements IVehicle, IFourWheeler {

	public NewVehicle() {
	}
	
	public void print()
	{
		System.out.println("I am new Vehicle and implemented both Vehicle and Four Wheeler. ");
	}
	
	public static void main(String[] args) {
		NewVehicle nv = new NewVehicle();
		nv.print();
	}

}
