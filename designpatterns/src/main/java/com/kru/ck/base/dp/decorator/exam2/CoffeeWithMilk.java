package com.kru.ck.base.dp.decorator.exam2;

public class CoffeeWithMilk extends DecoratedCoffee {
	
	public CoffeeWithMilk(Coffee coffee)
	{
		super(coffee);
	}

	@Override
	public Double getCost() {
		return super.getCost()+1;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + " + Milk.";
	}

}
