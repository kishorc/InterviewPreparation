package com.kru.ck.base.dp.decorator.exam2;

public abstract class DecoratedCoffee implements Coffee {

	Coffee decoratedCoffee;
	
	public DecoratedCoffee(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}
	
	@Override
	public Double getCost() {
		return decoratedCoffee.getCost();
	}

	@Override
	public String getIngredients() {
		return decoratedCoffee.getIngredients();
	}

}
