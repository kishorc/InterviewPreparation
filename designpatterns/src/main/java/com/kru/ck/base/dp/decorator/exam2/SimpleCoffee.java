package com.kru.ck.base.dp.decorator.exam2;

public class SimpleCoffee implements Coffee {

	@Override
	public Double getCost() {
		return 1.00;
	}

	@Override
	public String getIngredients() {
		return "Coffe";
	}

}
