package com.kru.ck.ds.linked.sll;


import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kru.ck.ds.linked.sll.SingleLinkedList;
import com.kru.ck.ds.linked.sll.SingleLinkedList.Node;


public class SingleLinkedListTest {

	SingleLinkedList list = null;
	SingleLinkedList list1 = null;

	@Before
	public void setUp() throws Exception {
		list = new SingleLinkedList();
		list1 = new SingleLinkedList();
	}

	@After
	public void tearDown() throws Exception {
		list = null;
		list1= null;
	}

	@Test
	public void test() {
		System.out.println("Node data START");
		Node node = new Node(123);
		System.out.println(node);
		System.out.println(new Node());
		System.out.println("Node data END\n");

		System.out.println("Prepend test START");
		list.prepend(123);
		list.print();
		list.prepend(150);
		list.print();
		list.prepend(250);
		list.print();
		list.prepend(350);
		list.print();
		list.prepend(450);
		list.print();
		list.clear();
		System.out.println("Prepend test END\n");

		System.out.println("Append test START");
		list.append(100);
		list.print();
		list.append(200);
		list.print();
		list.append(300);
		list.print();
		list.append(400);
		list.print();
		list.append(500);
		list.print();
		list.append(600);
		list.print();
		list.append(700);
		list.print();
		list.clear();
		System.out.println("Append test END\n");

		System.out.println("Remove Fisrt test START");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.removeFirst();
		list.print();
		list.clear();
		System.out.println("Remove Fisrt test END\n");

		System.out.println("Remove Last test START");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.removeLast();
		list.print();
		list.clear();
		System.out.println("Remove Last test END\n");

		System.out.println("insertAt test START");
		list.insertAt(-1, 10);
		list.print();
		list.insertAt(0, 2);
		list.print();
		list.insertAt(1, 100);
		list.print();
		list.insertAt(2, 200);
		list.print();
		list.insertAt(4, 400);
		list.print();
		list.clear();
		System.out.println("insertAt test END");

		System.out.println("Remove Last test START");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.print();
		list.removeAt(0);
		list.print();
		list.removeAt(-2);
		list.print();
		list.removeAt(8);
		list.print();
		list.removeAt(7);
		list.print();
		list.removeAt(1);
		list.print();
		list.clear();
		System.out.println("Remove Last test END\n");

		System.out.println("Remove Next test START");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.print();
		list.removeNext(list.getHead());
		list.print();
		list.removeNext(list.getHead().getNext().getNext().getNext().getNext());
		list.print();
		list.removeNext(list.getHead().getNext().getNext().getNext().getNext());
		list.print();
		list.removeNext(list.getHead().getNext().getNext().getNext());
		list.print();
		list.clear();
		System.out.println("Remove Next test END\n");

	}

	@Test
	public void testRemoveDuplicates() {
		list.append(100);
		list.append(200);
		list.append(100);
		list.append(400);
		list.append(500);
		list.append(400);
		list.append(700);
		list.append(100);
		list.append(900);
		list.append(400);
		list.append(400);
		list.append(400);
		list.append(100);
		list.append(200);
		list.append(900);
		list.append(800);
		list.append(900);
		list.append(700);
		list.append(1100);
		list.append(900);
		list.append(900);
		list.append(900);
		list.append(900);
		list.append(900);
		list.print();
		list.removeDuplicates();
		list.print();
	}

	@Test
	public void testRemoveNode() {
		list.append(100);
		list.append(200);
		list.append(100);
		list.append(400);
		list.append(500);
		list.append(400);
		list.append(700);
		list.append(100);
		list.append(900);
		list.append(400);
		list.append(400);
		list.append(400);
		list.append(100);
		list.append(200);
		list.append(900);
		list.append(800);
		list.append(900);
		list.append(700);
		list.append(1100);
		list.append(900);
		list.append(900);
		list.append(900);
		list.append(900);
		list.append(900);
		list.append(100);
		list.append(100);
		list.print();
		list.removeNode(100);
		list.print();
		list.removeNode(200);
		list.print();
		list.removeNode(900);
		list.print();
		list.removeNode(400);
		list.print();
	}

	@Test
	public void testReverse() {
		System.out.println("reverse test START");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.append(800);
		list.append(900);
		list.print();
		SingleLinkedList rList = list.reverse();
		rList.print();
		System.out.println("reverse test END\n");
	}

	@Test
	public void testReverseThis() {
		System.out.println("reverseThis test START");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.append(800);
		list.append(900);
		list.print();
		list.reverseThis();
		list.print();
		System.out.println("reverseThis test END\n");

	}

	@Test
	public void testReveseList() {
		System.out.println("ReveseList Last test START");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.append(800);
		list.append(900);
		list.print();
		list.reverseList();
		list.print();
		System.out.println("ReveseList Last test END\n");
	}

	@Test
	public void testInsertionSort() {
		System.out.println("Sort Asc  test START");
		list.append(29);
		list.append(23);
		list.append(82);
		list.append(11);
		list.print();
		list.insertionSort();
		list.print();
		list.clear();
		System.out.println();

		list.append(100);
		list.print();
		list.insertionSort();
		list.print();
		list.clear();
		System.out.println();

		list.print();
		list.insertionSort();
		list.print();
		System.out.println();

		Random rand = new Random();
		for (int i = 100; i < 150; i++) {
			list.append(rand.nextInt(i * 2));
		}
		list.print();
		list.insertionSort();
		list.print();

		System.out.println("Sort Asc  test END\n");
	}

	@Test
	public void voidSwapNthNodeWIthHead() {
		System.out.println("SwapNthNodeWIthHead  test START");

		// Case 1:
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.print();
		list.swapNthNodeWIthHead(3);
		list.print();
		list.clear();
		System.out.println();

		// Case 2:
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.print();
		list.swapNthNodeWIthHead(4);
		list.print();
		list.clear();
		System.out.println();

		// Case 3:
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.print();
		list.swapNthNodeWIthHead(1);
		list.print();
		list.clear();
		System.out.println();

		// Case 4:
		list.append(100);
		list.print();
		list.swapNthNodeWIthHead(1);
		list.print();
		list.clear();
		System.out.println();

		// Case 5:
		list.append(100);
		list.append(200);
		list.append(300);
		list.print();
		list.swapNthNodeWIthHead(3);
		list.print();
		list.clear();
		System.out.println();

		// Case 6:
		System.out.println("case 6:");
		list.append(100);
		list.append(200);
		list.print();
		list.swapNthNodeWIthHead(2);
		list.print();
		list.clear();
		System.out.println();

		// Case 7:
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.print();
		list.swapNthNodeWIthHead(5);
		list.print();
		list.clear();
		System.out.println();

		System.out.println("SwapNthNodeWIthHead  test END\n");
	}

	@Test
	public void testMergeTwoLists(){
		
		System.out.println("MergeTwoLists  test START\n");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.print();
		list1.append(300);
		list1.append(600);
		list1.append(700);
		list1.append(800);
		list1.print();
		//list.mergeTwoLists(list,list1);
		list.print();
		System.out.println("MergeTwoLists  test END\n");
	}
	
	@Test
	public void testGetEvenNodesList()
	{
		System.out.println("EvenNodesList  test START\n");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.append(800);
		list.append(900);
		list.append(1000);
		list.print();
		list1  = list.getEvenNodesList();
		list1.print();
		System.out.println("EvenNodesList  test END\n");
	}
	
	@Test
	public void testGetEvenNodesListInReverse()
	{
		System.out.println("EvenNodesListInReverse  test START\n");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.append(800);
		list.append(900);
		//list.append(1000);
		list.print();
		list1  = list.getEvenNodesListInReverse();
		list1.print();
		System.out.println("EvenNodesListInReverse  test END\n");
	}
	
	@Test
	public void testReverserEvenNodes()
	{

		System.out.println("ReverserEvenNodes  test START\n");
		System.out.println("case 1:");
		list.append(100);
		list.append(200);
		list.append(300);
		list.append(400);
		list.append(500);
		list.append(600);
		list.append(700);
		list.append(800);
		list.append(900);
		list.append(1000);
		list.print();
		list.reverserEvenNodes();
		list.print();
		list.clear();
		System.out.println();
		
		System.out.println("case 2:");
		list.reverserEvenNodes();
		list.print();
		System.out.println();
		
		System.out.println("case 3:");
		list.append(100);
		list.print();
		list.reverserEvenNodes();
		list.print();
		System.out.println();
		
		System.out.println("case 4:");
		list.append(200);
		list.print();
		list.reverserEvenNodes();
		list.print();
		System.out.println();
		
		System.out.println("case 5:");
		list.append(300);
		list.append(400);
		list.print();
		list.reverserEvenNodes();
		list.print();
		System.out.println();
		System.out.println("ReverserEvenNodes  test END\n");
	
	}
	
}
