package com.kru.ck.base.dp.decorator.exam1;

public class VerticalScroolbarWindowDecorator extends WindowDecorator {
	
	public VerticalScroolbarWindowDecorator(Window window)
	{
		super(window);
	}

	@Override
	public void draw() {
		super.draw();
		drawVerticalScroolBar();
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "Added Vertical scroolbar.";
	}
	
	private void drawVerticalScroolBar()
	{
		System.out.println("It is vertical scrool bar.");
	}
	
	
	

}
