package com.kru.ck.base.bytebybyte;

import java.util.Arrays;
import java.util.PriorityQueue;

//  Run time complexity  is   kn 

// Merging K number of sorted arrays 

//  Runtime complexity for 

 // Solution 1 :  Linear solution for this  k.n * log(kn)  -- Copy all the elements into result array apply some sorting 
 
// Solution 2  : Traverse  all the elements one by one copy the element into to result array --- Runtime complexity for this solution is  kn * k

// Solution 3 :  Using PriorityQueue  kn log( k )
 
public class MergeSoretedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] arrays = new int[][] {{1, 4, 7},{2, 5, 8},{3, 6, 9}};  
       int[][] arrays1 = new int[][] {{1, 3, 5},{2, 4}}; 
       System.out.println(" Length of the array " +  arrays.length);
       System.out.println(" Length of the array " +  arrays1.length);
       System.out.println(" Merge Output  " +   Arrays.toString(merge(arrays)) );
    	
	}

   public static int[] merge(int[][] arrays){
	   PriorityQueue<QueueNode> pq = new PriorityQueue<QueueNode>();
	   int size = 0;   
	   for(int i=0 ; i<arrays.length;i++){
		   size += arrays[i].length;
		   pq.add(new QueueNode(i,0,arrays[i][0]));
	   }
	    int[] result = new int[size];
	    
	   for(int i=0 ; !pq.isEmpty(); i++){
		   QueueNode qn = pq.poll();
		   
		   result[i] = qn.value;
		   int newIndex = qn.index +1;
		   if(newIndex < arrays[qn.array].length){
			   pq.add(new QueueNode(qn.array,newIndex,arrays[qn.array][newIndex]));
		   }
	   }
	   
	   return result;
	   
   }
}



class QueueNode implements Comparable<QueueNode>{
   int array,index,value;
   
	public QueueNode(int array, int index, int value){
		this.array = array;
		this.index = index;
		this.value = value;
	}
	
	@Override
	public int compareTo(QueueNode o) {
		// TODO Auto-generated method stub
		if(value > o.value)
		return 1;
		if (value< o.value)
		return -1;	
		
		return 0;
	}
	
}
