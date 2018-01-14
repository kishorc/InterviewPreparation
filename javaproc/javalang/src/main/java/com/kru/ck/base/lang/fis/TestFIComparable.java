package com.kru.ck.base.lang.fis;

public class TestFIComparable {

	public static void main(String[] args) {
		
		
		
		Comparable<Employee> idCompare = new Comparable<Employee>() {
			
			public int compareTo(Employee o) {
				
				return 0;
			}
		};
	}

}
