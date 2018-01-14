package com.kru.ck.ds.linked.sll;

import com.kru.ck.ds.linked.sll.SingleLinkedList.Node;


public class SllOperations {

	//Reverse the list data
	
	public static SingleLinkedList reverse(SingleLinkedList list)
	{
		if(list == null || list.getSize() < 2)
		{
			return list;
		}
		
		SingleLinkedList result = new SingleLinkedList();
		Node node = list.getHead();
		while(node != null)
		{
			result.prepend(node.getData());
			node = node.getNext();
		}
		
		return result;
	}
	
	//TODO::
	public static SingleLinkedList reverseSplit(SingleLinkedList list)
	{
		
		if(list == null || list.getSize() < 2)
		{
			return list;
		}
		
		SingleLinkedList result = new SingleLinkedList();
		
		while(list.getSize() != 1)
		{
			result.prepend(list.getTailData());
			result.append(list.getHeadData());
			list.removeFirst();list.removeLast();
			if(list.getSize() == 0)
			{
				break;
			}
		}
		
		return result;
	}
	
	public static Node getInterSectionList(SingleLinkedList list1, SingleLinkedList list2)
	{
		if(list1 == null || list2 == null)
		{
			return null;
		}
		
		int size1 = list1.getSize();
		int size2 = list2.getSize();
		
		Node head1 = null;
		Node head2 = null;
		
		int diff = 0;
		
		if(size1 >= size2)
		{
			diff = size1 - size2;
			head1 = list1.getHead();
			head2 = list2.getHead();
		}else {
			diff = size2 - size1;
			head1 = list2.getHead();
			head2 = list1.getHead();
		}
		
		while(diff > 0)
		{
			head1 = head1.getNext();
			diff--;
		}
		
		while(head1 != null)
		{
			if(head1.getData().equals(head2.getData()))
			{
				return head1;
			}
			
			head1 = head1.getNext();
			head2 = head2.getNext();
		}
		
		return null;
	}
public static Node find_nth_from_last(SingleLinkedList list1,int k){
		
		if(k==1){
			return list1.getTail();
		}
		if(k==list1.getSize()){
			return list1.getHead();
		}
		else if(k<list1.getSize()){
			Node head = list1.getHead();
			Node temp = list1.getHead();
			int size = list1.getSize();
			int counter=1;
			while(counter<=(size-k)){
				temp = temp.getNext();
				counter++;
			}
			return temp;
		}
		else{
			System.out.println(" Out of index");
			return null;
		}
		
	}

	

	
	public static void printNode(Node node)
	{
		if(node == null)
		{
			System.out.println("Empty Node.");
		}
		while(node != null)
		{
			System.out.print("[ " + node.getData() + " | N ] ");
			node = node.getNext();
		}
		System.out.println();
	}
	
}
