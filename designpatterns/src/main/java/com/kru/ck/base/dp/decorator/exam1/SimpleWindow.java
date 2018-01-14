package com.kru.ck.base.dp.decorator.exam1;

public class SimpleWindow implements Window {

	@Override
	public void draw() {
		System.out.println("Plain window");
	}

	@Override
	public String getDescription() {
		return "Simple window";
	}

}
