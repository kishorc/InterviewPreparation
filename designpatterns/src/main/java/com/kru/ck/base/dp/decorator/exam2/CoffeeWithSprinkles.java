package com.kru.ck.base.dp.decorator.exam2;

public class CoffeeWithSprinkles extends DecoratedCoffee {
	
	public CoffeeWithSprinkles(Coffee coffee) {
		super(coffee);
	}

	@Override
	public Double getCost() {
		return super.getCost() + 2;
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + " + Sprinkles.";
	}
	
	

}
