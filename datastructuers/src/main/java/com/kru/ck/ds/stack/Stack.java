package com.kru.ck.ds.stack;

import com.kru.ck.ds.linked.sll.SingleLinkedList;
import com.kru.ck.ds.linked.sll.SingleLinkedList.Node;

/**
 * 
 * @author smanchikal
 *	LIFO - Last In First Out
 */
public class Stack {
	
	//pop - 
	//push - add
	
	private SingleLinkedList list;
	
	public Stack()
	{
		this(null);
	}
	
	public Stack(Integer data)
	{
		list = new SingleLinkedList();
		list.prepend(data);
	}
	
	public Integer push(Integer data)
	{
		if(data == null)
		{
			return data;
		}
		
		list.append(data);
		
		return list.getTailData();
	}
	
	public Integer pop()
	{
		return list.getSize() > 0 ? list.removeLast().getData() : null;
	}
	
	public Integer peek()
	{
		return list.getTailData();
	}
	
	public boolean empty()
	{
		return (list.getSize() == 0);
	}
	
	public int search(Integer data)
	{
		return list.findPosition(data);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new  StringBuilder("Stack [");
		Node node = list.getHead();
		while(node != null)
		{
			builder.append(node.getData()).append(" ");
			node = node.getNext();
		}
		builder.append("]");
		
		return builder.toString();
	}

}
