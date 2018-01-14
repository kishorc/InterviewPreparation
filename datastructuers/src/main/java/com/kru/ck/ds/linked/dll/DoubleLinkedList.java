package com.kru.ck.ds.linked.dll;

public class DoubleLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public DoubleLinkedList() {
	}

	public void prepend(Integer data) {
		Node n = new Node(data);

		if (size == 0) {
			head = n;
			tail = n;
		} else {
			n.setNext(head);
			head.setPrev(n);
			head = n;
		}
		size++;
	}

	public void append(Integer data) {
		Node n = new Node(data);

		if (size == 0) {
			head = n;
			tail = n;
		} else {
			tail.setNext(n);
			n.setPrev(tail);
			tail = n;
		}
		size++;
	}

	public void removeFirst() {
		if (size > 1) {
			Node temp = head.getNext();
			temp.setPrev(null);
			head.setNext(null);
			head = temp;
			size--;
		} else if (size == 1) {
			head = null;
			tail = null;
			size--;
		}
	}

	public void removeLast() {
		if (size == 1) {
			tail = null;
			head = null;
			size--;
		} else if (size > 1) {
			Node temp = tail.getPrev();
			temp.setNext(null);
			tail.setPrev(null);
			tail = temp;
			size--;
		}
	}

	public void insertAt(int index, Integer data) {

		if (index < 1 || index > size + 1) {
			return;
		}

		if (index == 1) {
			prepend(data);
		} else if (index == size + 1) {
			append(data);
		} else {
			Node node = new Node(data); // new node
			Node temp = get(index); // already positioned node.

			Node prev = temp.getPrev();
			node.setPrev(prev);
			prev.setNext(node);

			temp.setPrev(node);
			node.setNext(temp);
			size++;
		}
	}

	public void removeAt(int index) {
		if (index < 1 || index > size) {
			return;
		}

		if (index == 1) {
			removeFirst();
		} else if (index == size) {
			removeLast();
		} else {
			Node temp = get(index);
			temp.getPrev().setNext(temp.getNext());
			temp.getNext().setPrev(temp.getPrev());
			temp.setNext(null);
			temp.setPrev(null);
			size--;
		}
	}

	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	/** 
	 * Returns the node of the given position. 
	 * @param index the position of the node.
	 * @return The Node if index is valid, other wise null.
	 */
	public Node get(int index) {
		Node node = null;
		
		if(index < 1 || index > size)
		{
			return node;
		}

		if (index > size / 2) {
			node = tail;
			int counter = size;
			while (counter > index) {
				node = node.getPrev();
				counter--;
			}
		} else {
			node = head;
			int counter = 1;
			while (counter < index) {
				node = node.getNext();
				counter++;
			}
		}
		return node;
	}

	public void print() {
		if (getSize() > 0) {
			Node node = getHead();
			StringBuilder builder = new StringBuilder();

			do {
				builder.append(node).append(' ');
				node = node.getNext();
			} while (node != null);
			System.out.println(builder.toString());
		} else {
			System.out.println("[ | | ]");
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	static class Node {
		Node prev;
		Integer data;
		Node next;

		public Node(Integer data) {
			super();
			this.data = data;
		}

		public Node(Node prev, Integer data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Integer getData() {
			return data;
		}

		public void setData(Integer data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();

			builder.append(" [ ").append(this.getPrev() != null ? 'P' : ' ').append(" | ").append(this.getData())
					.append(" | ").append(this.getNext() != null ? 'N' : ' ').append(" ] ");

			return builder.toString();
		}

	}

}
