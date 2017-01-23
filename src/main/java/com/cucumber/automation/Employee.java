package com.cucumber.automation;


public  class Employee implements Comparable<Employee> {
	
	
	
	private int id;
	
	private String name;	
	
			

	public Employee(int id, String name) {		
		this.id = id;
		this.name = name;		
		
	}



	public int compareTo(Employee other) {
		Integer empId = new Integer(this.id);
		
		return empId.compareTo(other.id);		

	}



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}
	
	
	
}