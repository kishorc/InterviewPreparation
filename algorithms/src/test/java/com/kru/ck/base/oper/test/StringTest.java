package com.kru.ck.base.oper.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEqualsIgnoreCase() {
		assertTrue("abc".equals("abc"));
		assertTrue("abc".equalsIgnoreCase("ABC"));
		assertTrue("abc".equalsIgnoreCase("ABc"));
		assertTrue("abc".equalsIgnoreCase("AbC"));
		assertTrue("abc".equalsIgnoreCase("abC"));
		assertTrue("abc".equalsIgnoreCase("aBC"));
		assertTrue("abc".equalsIgnoreCase("aBc"));
	}
	
	@Test
	public void testToLowerCase() {
		assertEquals("abc", "abc".toLowerCase());
		assertEquals("abc", "ABC".toLowerCase());
		assertEquals("abc", "ABc".toLowerCase());
		assertEquals("abc", "Abc".toLowerCase());
		assertEquals("abc", "AbC".toLowerCase());
		assertEquals("abc", "aBC".toLowerCase());
		assertNotEquals("ABC", "aBC".toLowerCase());
	} 
	
	@Test
	public void testToUpperCase() {
		assertEquals("ABC", "abc".toUpperCase());
		assertEquals("ABC", "ABc".toUpperCase());
		assertEquals("ABC", "Abc".toUpperCase());
		assertEquals("ABC", "AbC".toUpperCase());
		assertEquals("ABC", "aBC".toUpperCase());
		assertNotEquals("abc", "aBC".toUpperCase());
	}
	
	@Test
	public void testSubSequence()
	{
		assertEquals("abcd", "abcdefgh".subSequence(0, 4));
		assertEquals("efgh", "abcdefgh".subSequence(4, 8));
	}

	@Test
	public void testSubString()
	{
		assertEquals("abcd", "abcdefgh".substring(0, 4));
		assertEquals("efgh", "abcdefgh".substring(4, 8));
	}
	
	
	@Test
	public void testCompareTo()
	{
		assertEquals(-3, "ABC".compareTo("DEF"));
		assertEquals(3, "DEF".compareTo("ABC"));
		assertEquals(3, "AADEF".compareTo("AAABC"));
		assertEquals(1, "abce".compareTo("aabbc"));
		assertEquals(0, "abce".compareTo("abce"));
		assertEquals(0, "abce".compareToIgnoreCase("ABCE"));
		assertEquals(0, "ABCE".compareToIgnoreCase("abce"));
		assertEquals(3, "AADEF".compareToIgnoreCase("aaabbc"));
	}
	
	@Test
	public void testEquals()
	{
		assertTrue("abcdef".equals("abcdef"));
		assertTrue("xyz".equals("xyz"));
		assertFalse("xyz".equals("abc"));
		
		assertTrue("ABCDEF".equalsIgnoreCase("abcdef"));
		assertFalse("ABC".equals("abc"));
	}
	
}

