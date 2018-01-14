package com.kru.ck.base.lang.dis;

public class NewVehicle1 implements IFourWheeler, IVehicle {

	public NewVehicle1() {
	}

	public void print() {
		IVehicle.super.print();
		IFourWheeler.super.print();
	}

	public static void main(String[] args) {
		NewVehicle1 nv1 = new NewVehicle1();
		nv1.print();
	}

}
