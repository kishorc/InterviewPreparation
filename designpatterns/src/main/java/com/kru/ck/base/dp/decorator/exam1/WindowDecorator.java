package com.kru.ck.base.dp.decorator.exam1;

public abstract class WindowDecorator implements Window {

	Window windowToBeDecorated;

	public WindowDecorator() {
	}

	public WindowDecorator(Window windowToBeDecorated) {
		this.windowToBeDecorated = windowToBeDecorated;
	}

	@Override
	public void draw() {
		windowToBeDecorated.draw();

	}

	@Override
	public String getDescription() {
		return windowToBeDecorated.getDescription();
	}

}
