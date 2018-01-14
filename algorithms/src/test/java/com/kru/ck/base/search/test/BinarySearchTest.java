package com.kru.ck.base.search.test;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kru.ck.base.search.BinarySearch;
import com.kru.ck.base.search.Search;

public class BinarySearchTest {

	Search<Integer> intSearch = null;
	
	@Before
	public void setUp() throws Exception {
		intSearch = new BinarySearch<Integer>();
	}

	@After
	public void tearDown() throws Exception {
		intSearch = null;
	}

	@Test
	public void testDoSearch() {
		Integer[] inArray = {1, 2, 34, 121, 767, 3232, 6565, 7576, 43546, 323243};
		System.out.println("Binary Search test START");
		System.out.println(intSearch.doSearch(inArray, 767));
		System.out.println(intSearch.doSearch(inArray, 43546));
		System.out.println(intSearch.doSearch(inArray, 7576));
		System.out.println("Binary Search test END\n");
	}
	

	@Test
	public void testDoSearch2() {
		System.out.println("Binary Search test1 START");
		int[] arr = {1, 2, 34, 121, 767, 3232, 6565, 7576, 43546, 323243};
		System.out.println(intSearch.doSearch(arr, 767));
		System.out.println(intSearch.doSearch(arr, 43546));
		System.out.println(intSearch.doSearch(arr, 7576));
		System.out.println(intSearch.doSearch(arr, 323243));
		System.out.println("Binary Search test1 END\n");
		
		System.out.println("Binary Search test2 START");
		int[] array = {1, 3, 4, 6, 7, 9, 10, 12, 15, 21};
		System.out.println(intSearch.doSearch(array, 4));
		System.out.println(intSearch.doSearch(array, 1));
		System.out.println(intSearch.doSearch(array, 21));
		System.out.println("Binary Search test2 END\n");
	}

}
