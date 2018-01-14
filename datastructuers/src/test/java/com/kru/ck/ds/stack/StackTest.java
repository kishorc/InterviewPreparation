package com.kru.ck.ds.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kru.ck.ds.stack.Stack;

import junit.framework.Assert;

public class StackTest {

	private Stack stack = null;

	@Before
	public void setUp() throws Exception {
		stack = new Stack();
	}

	@After
	public void tearDown() throws Exception {
		stack = null;
	}

	@Test
	public void testPush() {
		System.out.println("Stack Push test START");

		stack.push(111);
		System.out.println(stack);
		stack.push(122);
		stack.push(134);
		stack.push(156);
		stack.push(165);
		stack.push(180);
		stack.push(190);
		System.out.println(stack);
		System.out.println("Stack Push test END\n");
	}

	@Test
	public void testPop() {

		System.out.println("Stack pop test START");
		System.out.println("pop the value : " + stack.peek());

		stack.push(100);
		stack.push(200);
		stack.push(100);
		stack.push(300);
		System.out.println("Stack  : {" + stack + " } pop the value : " + stack.pop());
		System.out.println("Stack  : " + stack);

		System.out.println("Stack  : {" + stack + " } pop the value : " + stack.pop());
		System.out.println("Stack  : " + stack);

		stack.push(800);
		stack.push(1100);
		System.out.println("Stack  : {" + stack + " } pop the value : " + stack.pop());
		System.out.println("Stack  : " + stack);

		System.out.println("Stack  : {" + stack + " } pop the value : " + stack.pop());
		System.out.println("Stack  : " + stack);

		stack.push(700);
		System.out.println("Stack  : {" + stack + " } pop the value : " + stack.pop());
		System.out.println("Stack  : " + stack);

		System.out.println("Stack pop test END\n");

	}

	@Test
	public void testPeek() {
		System.out.println("Stack peek test START");
		System.out.println("Peek the value : " + stack.peek());

		stack.push(100);
		System.out.println("Stack  : {" + stack + " } Peek the value : " + stack.peek());

		stack.push(200);
		System.out.println("Stack  : {" + stack + " } Peek the value : " + stack.peek());

		stack.push(300);
		System.out.println("Stack  : {" + stack + " } Peek the value : " + stack.peek());

		stack.push(400);
		System.out.println("Stack  : {" + stack + " } Peek the value : " + stack.peek());

		stack.push(700);
		System.out.println("Stack  : {" + stack + " } Peek the value : " + stack.peek());
		System.out.println("Stack peek test END\n");
	}

	@Test
	public void testEmpty() {
		System.out.println("Stack peek test START");
		Assert.assertTrue(stack.empty());
		System.out.println("empty : " + stack.empty());
		stack.push(123);
		Assert.assertFalse(stack.empty());
		System.out.println("empty : " + stack.empty());
		System.out.println("Stack peek test END\n");
	}

	@Test
	public void testSearch() {
		System.out.println("Stack search test START");
		Assert.assertTrue(stack.empty());
		System.out.println("position of 123 : " + stack.search(123));
		
		
		stack.push(123);
		System.out.println("position of 123 : " + stack.search(123));
		Assert.assertFalse(stack.empty());
		
		
		stack.push(123);stack.push(234);stack.push(345);stack.push(456);
		stack.push(567);stack.push(678);stack.push(789);stack.push(890);
		System.out.println("position of 123 : " + stack.search(123));
		System.out.println("position of 100 : " + stack.search(100));
		System.out.println("position of 789 : " + stack.search(789));
		System.out.println("position of 456 : " + stack.search(456));
		
		System.out.println("Stack search test END\n");
	}

}
