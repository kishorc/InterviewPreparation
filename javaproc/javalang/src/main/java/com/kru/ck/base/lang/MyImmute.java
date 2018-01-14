package com.kru.ck.base.lang;

public final class MyImmute {
	
	private final String name;
	private final int value;
	private final MyStudent stu;
	
	public MyImmute(String name, int value, MyStudent stu) {
		this.name = name;
		this.value = value;
		this.stu = (MyStudent) stu.clone();
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public MyStudent getStu() {
		return (MyStudent) stu.clone();
	}

}
