package com.kru.ck.base.lang;

public class MyStudent implements Cloneable {
	
	private String name;
	private int id;
	
	
	public MyStudent(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	protected Object clone() {
		Object obj = null;
		try {
			obj = new MyStudent(name, id);
		}catch(Exception e)
		{
		}
		return obj;
	}

}
