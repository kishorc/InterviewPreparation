package com.kru.ck.base.lang.dis;

public class MotorVehicle implements IMotorVehicle {

	public MotorVehicle() {
	}

	public static void main(String[] args) {
		MotorVehicle mv = new MotorVehicle();
		mv.print();
		// mv.write();
		IMotorVehicle.write();
		// IMotorVehicle.super.write();

	}

}
