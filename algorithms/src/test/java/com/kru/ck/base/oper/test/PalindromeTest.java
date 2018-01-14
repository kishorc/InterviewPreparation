package com.kru.ck.base.oper.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kru.ck.base.oper.Palindrome;

public class PalindromeTest {
	
	Palindrome palindrome;
	
	@Before
	public void setUp() throws Exception {
		palindrome = new Palindrome();
	}

	@After
	public void tearDown() throws Exception {
		palindrome = null;
	}

	@Test
	public void testIsPalindromeString() {
		assertTrue(palindrome.isPalindrome("aba"));
		assertTrue(palindrome.isPalindrome("msrsm"));
		assertTrue(palindrome.isPalindrome("abcdefggfedcba"));
		assertFalse(palindrome.isPalindrome("gegdfihewfewfgewgfewg"));
		assertFalse(palindrome.isPalindrome("jigjag"));
	}

	@Test
	public void testIsPalindrome1() {
		assertTrue(palindrome.isPalindrome("aba"));
		assertTrue(palindrome.isPalindrome("msrsm"));
		assertTrue(palindrome.isPalindrome("abcdefggfedcba"));
		assertFalse(palindrome.isPalindrome("gegdfihewfewfgewgfewg"));
		assertFalse(palindrome.isPalindrome("jigjag"));
	}

}
