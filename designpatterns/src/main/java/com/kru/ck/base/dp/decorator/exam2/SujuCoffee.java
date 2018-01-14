package com.kru.ck.base.dp.decorator.exam2;

public class SujuCoffee {
	
	public void coffee()
	{
		Coffee coffee = new SimpleCoffee();
		System.out.println("SimpleCoffee:  price : " + coffee.getCost() + ", ingredients : " + coffee.getIngredients());
	}
	
	public void milkCofee()
	{
		Coffee coffee = new CoffeeWithMilk(new SimpleCoffee());
		System.out.println("CoffeeWithMilk:  price : " + coffee.getCost() + ", ingredients : " + coffee.getIngredients());
	}
	
	public void sprinklesCofee()
	{
		Coffee coffee = new CoffeeWithSprinkles(new SimpleCoffee());
		System.out.println("CoffeeWithMilk:  price : " + coffee.getCost() + ", ingredients : " + coffee.getIngredients());
	}
	
	public void allCoffee()
	{
		Coffee coffee = new CoffeeWithMilk(new CoffeeWithSprinkles(new SimpleCoffee()));
		System.out.println("CoffeeWithMilk:  price : " + coffee.getCost() + ", ingredients : " + coffee.getIngredients());
	}

}
