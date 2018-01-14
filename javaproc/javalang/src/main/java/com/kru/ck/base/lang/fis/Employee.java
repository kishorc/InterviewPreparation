package com.kru.ck.base.lang.fis;

public class Employee {

	private String name;
	private Long id;
	private String role;
	private String designation;
	private Double salary;

	public Employee() {
	}
	
	public Employee(int i) {
		this("name-" + i, new Long(i), "role-" + i, "designation-" + i, new Double(1000 * i));
	}

	public Employee(String name, Long id, String role, String designation, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.designation = designation;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
