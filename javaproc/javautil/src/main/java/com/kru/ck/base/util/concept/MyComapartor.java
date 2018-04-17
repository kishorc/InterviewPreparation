package com.kru.ck.base.util.concept;

import java.util.Comparator;

class MyComapartor implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		StringBuffer j1 = ((StringBuffer) o1);
		StringBuffer j2 = ((StringBuffer) o2);
		    return (j1 .equals(j2) ? -1 : (j1 == j2 ? 0 : 1));
		
	}
	
}