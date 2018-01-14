package com.kru.ck.base.search.test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kru.ck.base.search.LinearSearch;

public class LinearSearchTest {

	LinearSearch search = null;
	
	@Before
	public void setUp() throws Exception {
		search = new LinearSearch();
	}

	@After
	public void tearDown() throws Exception {
		search = null;
	}

	@Test
	public void testDoSearch() {
		System.out.println("LinearSearch integer search START");
		Integer[] inArray = {1, 2, 6, 3, 7, 8, 123, 456, 789, 102, 213, 45, 2344, 6767};
		System.out.println(search.doSearch(inArray, 123));
		System.out.println(search.doSearch(inArray, -1));
		System.out.println(search.doSearch(inArray, -123));
		System.out.println(search.doSearch(inArray, 6767));
		System.out.println("LinearSearch integer search END\n");
		
		System.out.println("LinearSearch String search START");
		String[] strArray = {"Jan", "Feb", "Mar", "Apr", "May", "June"};
		System.out.println(search.doSearch(strArray, "Sept"));
		System.out.println(search.doSearch(strArray, "May"));
		System.out.println(search.doSearch(strArray, null));
		System.out.println(search.doSearch(strArray, ""));
		System.out.println(search.doSearch(strArray, "         "));
		System.out.println("LinearSearch String search END\n");
	}

}
