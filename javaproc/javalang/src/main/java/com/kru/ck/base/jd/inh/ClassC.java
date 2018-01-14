package com.kru.ck.base.jd.inh;

/**
 * Notice that test() method is making a call to superclass doSomething() method.
 * This leads to the ambiguity as compiler doesn’t know which superclass method to execute.
 * Because of the diamond shaped class diagram, it’s referred as Diamond Problem in java.
 * @author Siva
 *
 */
public class ClassC extends ClassA/*, ClassB */ {
	
	public void test()
	{
		doSomeThing();
	}

}
