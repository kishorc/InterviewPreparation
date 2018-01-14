package com.kru.ck.ds.queue;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kru.ck.ds.queue.Queue;

public class QueueTest {

	private Queue queue;
	
	@Before
	public void setUp() throws Exception {
		queue = new Queue();
	}

	@After
	public void tearDown() throws Exception {
		queue = null;
	}

	@Test
	public void testOffer() {
		System.out.println("Queue offer test START");
		
		
		
		System.out.println("Queue offer test END\n");
	}

	@Test
	public void testPeek() {
	}

	@Test
	public void testPoll() {
	}

}
