package com.kru.ck.base;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOperationsTest {
	NumberOperations n = null;
	
	@Before
	public void setUp() throws Exception {
		n = new NumberOperations();
	}

	@After
	public void tearDown() throws Exception {
		n = null;
	}

	@Test
	public void testReversNumber() {
		Assert.assertEquals(1234, n.reversNumber(4321));
		Assert.assertEquals(4321, n.reversNumber(1234));
		Assert.assertEquals(12, n.reversNumber(21));
		Assert.assertEquals(-126, n.reversNumber(-621));
		Assert.assertEquals(+456, n.reversNumber(654));
		Assert.assertEquals(+126789, n.reversNumber(987621));
		Assert.assertEquals(-0, n.reversNumber(-0));
		Assert.assertEquals(0, n.reversNumber(0));
		Assert.assertEquals(9, n.reversNumber(9));
		Assert.assertEquals(-1, n.reversNumber(-1));
		Assert.assertEquals(1, n.reversNumber(100000));
	}

}
