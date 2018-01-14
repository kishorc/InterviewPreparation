package com.kru.ck.ds.linked.sll;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kru.ck.ds.linked.sll.SingleLinkedList;
import com.kru.ck.ds.linked.sll.SllOperations;
import com.kru.ck.ds.linked.sll.SingleLinkedList.Node;

import junit.framework.Assert;

public class SllOperationsTest {

	SingleLinkedList list;
	
	@Before
	public void setUp() throws Exception {
		list = new SingleLinkedList();
	}

	@After
	public void tearDown() throws Exception {
		list = null;
	}

	@Test
	public void testReverse() {
		list.append(100);list.append(200);list.append(300);list.append(400);
		list.append(500);list.append(600);list.append(700);list.append(800);
		list.print();
		SingleLinkedList result = SllOperations.reverse(list);
		result.print();
		Assert.assertEquals(result.getHead(), list.getTail());
		Assert.assertEquals(result.getTail(), list.getHead());
	}
	
	@Test
	public void testReverseSplit()
	{
		list.append(100);list.append(200);list.append(300);list.append(400);
		list.append(500);list.append(600);list.append(700);list.append(800);
		list.append(900);
		list.print();
		SingleLinkedList result = SllOperations.reverseSplit(list);
		result.print();
		list.print();
	}
	
	@Test
	public void testGetInterSectionList()
	{
		System.out.println("Test interSectionList : START ");
		SingleLinkedList list1 = new SingleLinkedList();
		list1.append(29);list1.append(23);list1.append(82);list1.append(11);
		list1.append(12);list1.append(27);
		list1.print();
		
		SingleLinkedList list2 = new SingleLinkedList();
		list2.append(13);list2.append(14);list2.append(12);list2.append(27);
		list2.print();
		
		Node result = SllOperations.getInterSectionList(list1, list2);
		SllOperations.printNode(result);
		System.out.println();
		
		list2.clear();
		list2.append(13);list2.append(14);list2.append(11);list2.append(28);
		list1.print();
		list2.print();
		result = SllOperations.getInterSectionList(list1, list2);
		SllOperations.printNode(result);
		System.out.println();
		
		list1.clear();
		list1.append(13);list1.append(14);list1.append(11);list1.append(28);
		list2.clear();
		list2.append(16);list2.append(18);list2.append(13);list2.append(14);list2.append(11);list2.append(28);
		list1.print();
		list2.print();
		result = SllOperations.getInterSectionList(list1, list2);
		SllOperations.printNode(result);
		System.out.println();
		
		
		list1.clear();
		list1.append(13);list1.append(14);list1.append(11);list1.append(28);
		list2.clear();
		list2.append(13);list2.append(14);list2.append(11);list2.append(28);
		list1.print();
		list2.print();
		result = SllOperations.getInterSectionList(list1, list2);
		SllOperations.printNode(result);
		System.out.println();
		
		System.out.println("Test interSectionList : START ");
		
	}
	
	@Test
	public void  testFind_nth_from_last(){
		System.out.println("Test testfind_nth_from_last : START ");
		SingleLinkedList list1 = new SingleLinkedList();
		list1.append(29);list1.append(23);list1.append(82);list1.append(11);
		list1.append(12);list1.append(27);
		list1.print();	
		Node result = SllOperations.find_nth_from_last(list1, 10);
		SllOperations.printNode(result);
		
	}

}
