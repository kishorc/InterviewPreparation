package com.kru.ck.ds.linked.sll;

import java.util.HashSet;
import java.util.Set;

public class SingleLinkedList {

	private Node head;
	private Node tail;
	private int size = 0;

	public SingleLinkedList() {
	}

	public void prepend(Integer data) {
		if (data == null) {
			return;
		}
		Node n = new Node(data);
		if (size == 0) {
			head = n;
			tail = n;
		} else {
			n.setNext(head);
			head = n;
		}
		size++;
	}

	public Node append(Integer data) {
		if (data == null) {
			return null;
		}
		Node n = new Node(data);

		if (size == 0) {
			head = n;
			tail = n;
		} else {
			tail.setNext(n);
			tail = n;
		}

		size++;
		return n;
	}

	public Node removeFirst() {
		if (head != null) {
			Node temp = head;
			head = head.getNext();
			if (size == 1) {
				tail = null;
			}
			size--;
			return temp;
		}

		return null;
	}

	public Node removeLast() {
		if (size < 1) {
			return null;
		}

		Node temp = null;
		if (size == 1) {
			temp = head;
			tail = null;
			head = null;
		} else {
			Node n = get(size - 1);
			n.setNext(null);
			temp = tail;
			tail = n;
		}
		size--;

		return temp;
	}

	public Node removeNext(Node n) {
		if (n == null || n.getNext() == null) {
			return n;
		}

		Node temp = n.getNext();
		n.setNext(temp.getNext());
		size--;

		if (temp.getNext() == null) {
			tail = n;
		} else {
			temp.setNext(null);
		}

		return n;
	}

	public void insertAt(int index, Integer data) {
		if (index < 1 || index > size + 1 || data == null) {
			return;
		}

		if (index == 1) {
			prepend(data);
		} else if (index == size + 1) {
			append(data);
		} else {
			Node n = new Node(data);
			Node temp = get(index - 1);
			n.next = temp.next;
			temp.next = n;
			size++;

		}
	}

	public void removeAt(int index) {
		if (index < 1 || index > size) {
			return;
		} else if (index == 1) {
			removeFirst();

		} else if (index == size) {
			removeLast();
		} else {
			Node n = get(index - 1);
			Node temp = n.next;
			n.next = temp.next;
			temp.next = null;
			size--;

		}
	}

	public Node get(int index) {
		if (index < 1 || index > size) {
			return null;
		} else if (index == 1) {
			return head;
		} else if (index == size) {
			return tail;
		} else {
			int counter = 1;
			Node n = head;
			while (counter < index) {
				n = n.getNext();
				counter++;
			}
			return n;
		}
	}

	public void print() {
		StringBuilder builder = new StringBuilder();
		Node n = head;
		while (n != null) {
			builder.append(n).append(" ");
			n = n.getNext();
		}
		System.out.println(builder.toString());
	}

	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	public int findPosition(Integer data) {
		if (data == null) {
			return 0;
		}

		Node n = head;
		int pos = 1;
		while (n != null) {
			if (n.getData().equals(data)) {
				return pos;
			} else {
				n = n.getNext();
				pos++;
			}
		}

		return 0;
	}

	public void removeDuplicates() {

		if (head == tail) {
			return;
		}

		Node temp = head;
		Integer data = temp.getData();
		Set<Integer> datas = new HashSet<Integer>();
		datas.add(data);
		while (temp != null && temp.getNext() != null) {
			if (!datas.contains(temp.getNext().getData())) {
				datas.add(temp.getNext().getData());
				temp = temp.getNext();
			} else {
				temp.setNext(temp.getNext().getNext());
				size--;
			}
		}
		tail = temp;
	}

	public void removeNode(Integer data) {
		if (data == null || head == null) {
			return;
		}

		Node temp = head;
		while (temp != null && temp.getNext() != null) {
			if (!data.equals(temp.getNext().getData())) {
				temp = temp.getNext();
			} else {
				temp.setNext(temp.getNext().getNext());
				size--;
			}
		}
		tail = temp;

		if (data.equals(head.getData())) {
			head = head.getNext();
			size--;
		}
	}

	public SingleLinkedList reverse() {
		if (size < 2) {
			return this;
		}

		SingleLinkedList list = new SingleLinkedList();
		Node temp = head;

		while (temp != null) {
			list.prepend(temp.getData());
			temp = temp.getNext();
		}

		return list;
	}

	public void reverseThis() {
		if (size > 1) {

			Node n1 = head;
			while (n1.getNext() != null) {
				Node n2 = n1.getNext();
				n1.setNext(n2.getNext());
				n2.setNext(head);
				head = n2;
			}
			// 10, 20, 30, 40
			// n1 = 10, n2 = 20:
			// 20, 10, 30, 40
			// n1 = 10, n2=30
			// 30, 20, 10, 40
			// n1 = 10, n2 40
			// 40, 30, 20, 10
		}
	}

	public void reverseList() {
		Node head = this.head;

		if (head == null || head.next == null) {

			return;
		}
		Node todo = head.next;
		Node reverse = head;
		reverse.next = null;

		while (todo != null) {
			Node temp = todo;
			todo = todo.next;

			temp.next = reverse;
			reverse = temp;
		}
		this.head = reverse;
	}

	/**
	 * Insertions sort of the list in ascending order
	 */
	public void insertionSort() {
		Node sorted = null;
		Node curr = head;
		while (curr != null) {
			Node temp = curr.next;
			sorted = sortedInsert(sorted, curr);
			curr = temp;
		}
		head = sorted;
	}

	private Node sortedInsert(Node head, Node node) {
		if (node == null) {
			return head;
		}

		if (head == null || node.data <= head.data) {
			node.next = head;
			return node;
		}

		Node curr = head;
		while (curr.next != null && (curr.next.data < node.data)) {
			curr = curr.next;
		}

		node.next = curr.next;
		curr.next = node;

		return head;
	}

	public Node mergeTwoLists(SingleLinkedList list1, SingleLinkedList list2) {
		if (list1 == null && list2 == null) {
			return null;
		} else if (list1 == null && list2 != null) {

			return list2.getHead();
		} else if (list1 != null && list2 == null) {
			return list1.getHead();
		} else {
			Node temp = list2.getHead();
			Node merge = null;
			while (temp != null) {
				Node node = temp;
				merge = sortedInsert(list1.getHead(), node);
				temp = temp.getNext();
			}

			return merge;
		}
	}

	/**
	 * Swap Nth Node with Head
	 */
	public void swapNthNodeWIthHead(int n) {
		if (n < 2 || size < n) {
			return;
		}

		if (size == 2) {
			Node oldHead = this.head;
			tail.setNext(oldHead);
			oldHead.next = null;
			head = tail;
			tail = oldHead;
		} else {
			Node oldHead = this.head;
			swapNodes(oldHead, get(n - 1));
		}

	}

	private void swapNodes(Node oldHead, Node target) {
		Node newHead = target.next;
		Node temp = newHead.next;
		newHead.next = oldHead.next;
		oldHead.next = temp;
		target.next = oldHead;
		this.head = newHead;
	}
	
	public void reverserEvenNodesIndependentSolution()
	{
		Node curr = this.head;
		Node listEven = null;
		// 1 2 3 4 5 6 7
		while(curr != null && curr.next != null)
		{
			Node even = curr.next;
			curr.next = even.next;
			even.next = listEven;
			listEven = even;
			curr = curr.next;
		} 
		
		mergeNodes(this.head, listEven);
	}
	
	private Node mergeNodes(Node list1, Node list2)
	{
		if(list1 == null)
		{
			return list2;
		}
		
		if(list2 == null)
		{
			return list1;
		}
		// list1 = 1 2 3 4 5 6 7
		// list2 = 6 4 2
		
		Node nodeHead = list1;
		
		while(list1.next != null && list2 != null)
		{
			Node temp = list2; 
			list2 = list2.next;
			
			temp.next = list1.next;
			list1.next = temp; 
			list1 = temp.next;
		}
		if(list1.next == null)
		{
			list1.next = list2;
		}
		
		return nodeHead;
	}
	
	
	public void reverserEvenNodes()
	{
		Node evenTemp = getEvenNodesListInReverse().getHead();
		if(evenTemp == null)
		{
			return;
		}
		
		Node temp = this.head;
		int counter = 1;
		while(temp != null)
		{
			if(counter % 2 == 0)
			{
				temp.setData(evenTemp.getData());
				evenTemp = evenTemp.getNext();
			}
			temp = temp.next;
			counter++;
		}
	}
	
	
	public SingleLinkedList getEvenNodesList() {
		SingleLinkedList sl = new SingleLinkedList();
		int counter = 1;
		Node temp = head;
		while(temp != null)
		{
			if(counter % 2 == 0)
			{
				sl.append(temp.data);
			}
			temp = temp.next;
			counter++;
		}
		
		return sl;
	}
	
	public SingleLinkedList getEvenNodesListInReverse() {
		SingleLinkedList sl = new SingleLinkedList();
		int counter = 1;
		Node temp = this.head;
		while(temp != null)
		{
			if(counter % 2 == 0)
			{
				sl.prepend(temp.data);
			}
			temp = temp.next;
			counter++;
		}
		
		return sl;
	}
	
	/**
	 * Node nested class.
	 * @author smanchikal
	 *
	 */
	public static class Node {
		Node next;
		Integer data;

		public Node() {
		}

		public Node(Integer data) {
			this.data = data;
		}

		public Node(Node next, Integer data) {
			this.next = next;
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Integer getData() {
			return data;
		}

		public void setData(Integer data) {
			this.data = data;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}

			if (obj == null || !(obj instanceof Node)) {
				return false;
			}

			Node n = (Node) obj;
			if (n.getData() == null || this.getData() == null || !n.getData().equals(this.getData())) {
				return false;
			}

			return true;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("[").append(data != null ? data : "").append(" | ").append(next != null ? "N ]" : "]");

			return builder.toString();
		}

	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getSize() {
		return size;
	}

	public Integer getTailData() {
		return tail != null ? tail.getData() : null;
	}

	public Integer getHeadData() {
		return head != null ? head.getData() : null;
	}

}
