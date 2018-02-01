package com.apple.store.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	//Given a collection of intervals, merge all overlapping intervals. For example, Given [1,3],[2,6],[8,10],[15,18], return [1,6],[8,10],[15,18].
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Interval> al = new ArrayList<Interval>();
         al.add(new Interval(1,3));
         al.add(new Interval(2,6));
         al.add(new Interval(8,10));
         al.add(new Interval(15,18));
         Collections.sort(al,new IntervalComparator());
         
         Interval first = al.get(0);
         int start= first.start;
         int end = first.end;
         ArrayList<Interval> result = new ArrayList<Interval>();
         for(int i=0 ; i<al.size();i++){
        	 Interval temp = al.get(i);
        	  if (temp.start <=end){
        		  end = Math.max(temp.end,end);
        	  }
        	  else{
        		  result.add(new Interval(start, end));
                  start = temp.start;
                  end = temp.end;
        	  }
   	 
         }
         result.add(new Interval(start, end));
         System.out.println(al);
         
         System.out.println(result);
    
	}

}

 class Interval{
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
	@Override
	public String toString() {
		return "[" + start + ", " + end + "]";
	}
	
}

class IntervalComparator implements Comparator<Interval>{

	@Override
	public int compare(Interval o1, Interval o2) {
		// TODO Auto-generated method stub
				Interval i1 = o1;
				Interval i2 =  o2;
				
				return i1.start - i2.start;
	}
	
	
	
}