package com.kru.ck.base.oper.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kru.ck.base.oper.RemoveChar;

public class RemoveCharTest {
	
	RemoveChar removeChar;

	@Before
	public void setUp() throws Exception {
		removeChar = new RemoveChar();
	}

	@After
	public void tearDown() throws Exception {
		removeChar = null;
	}

	@Test
	public void testRemoveAll() {
		assertEquals("bcdef", removeChar.removeAll("abcadef", 'a'));
		assertEquals("abcdefg", removeChar.removeAll("xaxbxcxdxexfxg", 'x'));
		assertEquals("abcde", removeChar.removeAll("abcde", 'x'));
		assertNotEquals("abcde", removeChar.removeAll("abcdqe", 'x'));
	}

	@Test
	public void testReplaceAll() {
		assertEquals("xbcxdef", removeChar.replaceAll("abcadef", 'a', 'x'));
		assertEquals("yaybycydyeyfyg", removeChar.replaceAll("xaxbxcxdxexfxg", 'x', 'y'));
		assertEquals("abcde", removeChar.replaceAll("abcde", 'x', 'y'));
		assertNotEquals("abcde", removeChar.replaceAll("abcdqe", 'x', 'y'));
	}

}
