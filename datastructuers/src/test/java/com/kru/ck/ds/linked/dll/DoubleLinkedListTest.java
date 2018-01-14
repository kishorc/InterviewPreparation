/**
 * 
 */
package com.kru.ck.ds.linked.dll;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kru.ck.ds.linked.dll.DoubleLinkedList;

/**
 * @author smanchikal
 *
 */
public class DoubleLinkedListTest {

	DoubleLinkedList list = null;
			
	@Before
	public void setUp() throws Exception {
		list = new DoubleLinkedList();
	}

	@After
	public void tearDown() throws Exception {
		list.clear();
	}

	/**
	 * Test method for {@link com.kru.ck.ds.linked.dll.DoubleLinkedList#prepend(java.lang.Integer)}.
	 */
	@Test
	public void testPrepend() {
		System.out.println("Prepend test : START");
		list.prepend(100);
		list.print();
		list.prepend(300);
		list.print();
		list.prepend(700);
		list.print();
		list.prepend(200);
		list.print();
		list.prepend(900);
		list.print();
		System.out.println("Prepend test : END\n");
		list.clear();
	}

	/**
	 * Test method for {@link com.kru.ck.ds.linked.dll.DoubleLinkedList#append(java.lang.Integer)}.
	 */
	@Test
	public void testAppend() {
		System.out.println("Append test : START");
		list.append(150);
		list.print();
		list.append(250);
		list.print();
		list.append(550);
		list.print();
		list.append(950);
		list.print();
		list.append(750);
		list.print();
		System.out.println("Append test : END\n");
		list.clear();
	}

	/**
	 * Test method for {@link com.kru.ck.ds.linked.dll.DoubleLinkedList#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst() {
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		System.out.println("Remove First test : START");
		list.print();
		while (list.getSize() > 0) {
			list.removeFirst();
			list.print();
		}
		System.out.println("Remove First test : END\n");
	}

	/**
	 * Test method for {@link com.kru.ck.ds.linked.dll.DoubleLinkedList#removeLast()}.
	 */
	@Test
	public void testRemoveLast() {
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		System.out.println("Remove Last test : START");
		list.print();
		while (list.getSize() > 0) {
			list.removeLast();
			list.print();
		}
		System.out.println("Remove Last test : END\n");
	}

	/**
	 * Test method for {@link com.kru.ck.ds.linked.dll.DoubleLinkedList#insertAt(int, java.lang.Integer)}.
	 */
	@Test
	public void testInsertAt() {
		System.out.println("insertAt test : START");
		list.insertAt(0, 100);
		list.print();
		list.insertAt(1, 100);
		list.print();
		list.insertAt(2, 200);
		list.print();
		list.insertAt(3, 300);
		list.print();
		list.insertAt(0, 400);
		list.print();
		list.insertAt(2, 250);
		list.print();
		list.insertAt(3, 350);
		list.print();
		list.insertAt(7, 750);
		list.print();
		list.insertAt(6, 650);
		list.print();
		list.insertAt(8, 850);
		list.print();
		list.insertAt(15, 1050);
		list.print();
		System.out.println("insertAt test : START\n");
		list.clear();
	}

	/**
	 * Test method for {@link com.kru.ck.ds.linked.dll.DoubleLinkedList#removeAt(int)}.
	 */
	@Test
	public void testRemoveAt() {
		System.out.println("removeAT test : START");
		list.removeAt(3);list.print();
		list.removeAt(0);list.print();
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.print();
		list.removeAt(0);list.print();
		list.removeAt(8);list.print();
		list.removeAt(3);
		list.print();
		
		list.removeAt(7);list.print();
		list.removeAt(6);list.print();
		System.out.println("removeAt test : END\n");
	}

	/**
	 * Test method for {@link com.kru.ck.ds.linked.dll.DoubleLinkedList#clear()}.
	 */
	@Test
	public void testClear() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.kru.ck.ds.linked.dll.DoubleLinkedList#get(int)}.
	 */
	@Test
	public void testGet() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.kru.ck.ds.linked.dll.DoubleLinkedList#print()}.
	 */
	@Test
	public void testPrint() {
		//fail("Not yet implemented");
	}

}
