package com.kru.ck.base.util.concept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Integer,String> hm = new HashMap<Integer,String>();
      hm.put(1,"abc");
      hm.put(2,"cde");
      hm.put(3, "efg");
      hm.put(null, "ghi");
      hm.put(null, "ijk");
      hm.put(3, "klm");
      System.out.println(hm.values());
      System.out.println(hm.keySet());
       Set<Entry<Integer,String>> en = hm.entrySet();
      Iterator<Entry<Integer, String>> it = en.iterator();
       while(it.hasNext()){
    	   Map.Entry<Integer, String> me = it.next();
    	   System.out.println(me.getKey() +"------"+me.getValue());
       }
       System.out.println("-----------");
       LinkedHashMap<Integer,String> hm1 = new LinkedHashMap<Integer,String>();
       hm1.put(1,"abc");
       hm1.put(2,"cde");
       hm1.put(3, "efg");
       hm1.put(null, "ghi");
       hm1.put(null, "ijk");
       hm1.put(3, "klm");
       System.out.println(hm1.values());
       System.out.println(hm1.keySet());
        Set<Entry<Integer,String>> en1 = hm1.entrySet();
       Iterator<Entry<Integer, String>> it1 = en1.iterator();
        while(it1.hasNext()){
     	   Map.Entry<Integer, String> me1 = it1.next();
     	   System.out.println(me1.getKey() +"------"+me1.getValue());
        }       
        System.out.println(hm);
        System.out.println(hm1);
	}

}
