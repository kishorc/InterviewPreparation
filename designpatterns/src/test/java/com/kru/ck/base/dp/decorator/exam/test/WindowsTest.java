package com.kru.ck.base.dp.decorator.exam.test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kru.ck.base.dp.decorator.exam1.Windows;

public class WindowsTest {
	
	Windows windows;

	@Before
	public void setUp() throws Exception {
		windows = new Windows();
	}

	@After
	public void tearDown() throws Exception {
		windows = null;
	}

	@Test
	public void testPlainWindow() {
		windows.plainWindow();
		System.out.println();
	}

	@Test
	public void testHorizontalwindow() {
		windows.Horizontalwindow();
		System.out.println();
	}

	@Test
	public void testVerticalWindow() {
		windows.VerticalWindow();
		System.out.println();
	}

	@Test
	public void testFullWindow() {
		windows.fullWindow();
		System.out.println();
	}

}
