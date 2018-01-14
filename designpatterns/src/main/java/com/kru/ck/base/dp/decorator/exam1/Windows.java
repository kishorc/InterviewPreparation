package com.kru.ck.base.dp.decorator.exam1;

public class Windows {
	
	public void plainWindow()
	{
		Window window = new SimpleWindow();
		window.draw();
		System.out.println(window.getDescription());
	}
	
	public void Horizontalwindow()
	{
		Window window = new HorizontalScroolbarDecorator(new SimpleWindow());
		window.draw();
		System.out.println(window.getDescription());
	}
	
	public void VerticalWindow()
	{
		Window window = new VerticalScroolbarWindowDecorator(new SimpleWindow());
		window.draw();
		System.out.println(window.getDescription());
	}
	
	
	public void fullWindow()
	{
		Window window = new VerticalScroolbarWindowDecorator(new HorizontalScroolbarDecorator(new SimpleWindow()));
		window.draw();
		System.out.println(window.getDescription());
	}

}
