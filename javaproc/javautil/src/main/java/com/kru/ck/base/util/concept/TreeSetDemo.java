package com.kru.ck.base.util.concept;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SortedSet<StringBuffer> ss = new TreeSet<StringBuffer>(new MyComapartor());
        ss.add(new StringBuffer("as"));
        ss.add(new StringBuffer("ab"));
        ss.add(new StringBuffer("ac"));
        
        System.out.println(ss);
	}

}




