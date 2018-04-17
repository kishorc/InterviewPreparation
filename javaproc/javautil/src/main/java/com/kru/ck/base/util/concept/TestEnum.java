package com.kru.ck.base.util.concept;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeEnum employeeEnum = EmployeeEnum.value;
		
		
		EmployeeEnum employeeEnum1 = EmployeeEnum.value;
		employeeEnum.setName(10);
		
		
		System.out.println(employeeEnum.getName());
		
		System.out.println(employeeEnum1.getName());
	}

}
