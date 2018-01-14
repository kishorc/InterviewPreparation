package com.kru.ck.ds.queue;

import com.kru.ck.ds.linked.sll.SingleLinkedList;
import com.kru.ck.ds.linked.sll.SingleLinkedList.Node;

/**
 * 
 * @author smanchikal
 *	FIFO (first-in-first-out)
 */
public class Queue {
	
	private SingleLinkedList list;

	public Queue() {
		list = new SingleLinkedList();
	}
	
	public Queue(Integer data) {
		list = new SingleLinkedList();
		list.append(data);
	}
	
	public boolean offer(Integer data)
	{
		if(data == null)
		{
			return false;
		}
		
		return list.append(data) != null;
	}
	
	public Integer peek()
	{
		
		return list.getHeadData();
	}
	
	public Integer poll()
	{
		return list.getSize() > 0 ? list.removeFirst().getData() : null;
	}
	

	
	public void print()
	{
		System.out.println(this);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Queue [ ");
		Node node = list.getHead();
		while(node != null)
		{
			builder.append(node.getData()).append(" ");
			
		}
	
		builder.append("]");
		
		return builder.toString();
	}
	

}
