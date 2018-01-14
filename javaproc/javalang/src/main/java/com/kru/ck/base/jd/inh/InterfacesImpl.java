package com.kru.ck.base.jd.inh;

public class InterfacesImpl implements InterfaceA, InterfaceB, InterfaceC {

	@Override
	public void doSomeThing() {
		System.out.println("doSomeThing() in implementation class.");
	}

	
	public static void main(String[] args) {
		InterfaceA obj1 = new InterfacesImpl();
		InterfaceB obj2 = new InterfacesImpl();
		InterfaceC obj3 = new InterfacesImpl();
		
		obj1.doSomeThing();
		obj2.doSomeThing();
		obj3.doSomeThing();
	}
}
