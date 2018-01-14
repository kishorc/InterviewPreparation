package com.kru.ck.base.search;

public interface Search<T> {

	public int doSearch(T[] array, T input);
	
	public int doSearch(int[] array, int input);
	
}
