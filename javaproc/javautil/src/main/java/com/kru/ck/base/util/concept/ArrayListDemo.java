package com.kru.ck.base.util.concept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> list = new ArrayList<String>();
         list.add("abc");
         list.add("cde");
         list.add("efg");
         list.add("hij");
         list.add("klm");
         
         Iterator<String> it= list.iterator();
          while(it.hasNext()){
        	  System.out.println(it.next());
          }
	}

}
