package com.kru.ck.base.dp.decorator.exam1;

public class HorizontalScroolbarDecorator extends WindowDecorator {

	public HorizontalScroolbarDecorator(Window window)
	{
		super(window);
	}

	@Override
	public void draw() {
		super.draw();
		drawHorizontalScroolbar();
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " Horizontal scroolbar.";
	}
	
	private void drawHorizontalScroolbar()
	{
		System.out.println("Drawing horizontal scroolbar.");
	}
	
}
