package com.cucumber.automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;



public class CollectionsTest {
	
public static void main(String[] args){
		
		//Employee emp1 = new Employee(1, "Venkat", "waterstone", "cumming", "GA", "30041", 5000.00);
		//emp1.printAddress();
		
		
		Set<String> namesSet = new HashSet<String>();
		namesSet.add("Venkat");
		namesSet.add("Bindu");
		namesSet.add("Krish");
		
		
		for (String name : namesSet) {
			//System.out.println(name);
		}
		
		
		SortedSet<String> namesSortedSet = new TreeSet<String>();
		namesSortedSet.add("Venkat");
		namesSortedSet.add("Bindu");
		namesSortedSet.add("Krish");
		
		
		for (String name : namesSortedSet) {
			//System.out.println(name);
		}
		
		SortedSet<Employee> empSortedSet = new TreeSet<Employee>();
		Employee emp3 = new Employee(20,"20");
		Employee emp1 = new Employee(1,"1");
		Employee emp2 = new Employee(10,"10");
		
		
		empSortedSet.add(emp1);
		empSortedSet.add(emp2);
		empSortedSet.add(emp3);
		
		
		for (Employee emp : empSortedSet) {
			//System.out.println(emp.getId());
			//System.out.println(emp.getName());
		}
		
		List<String> nameslist = new ArrayList<String>();
		nameslist.add("Venkat");
		nameslist.add("Bindu");
		nameslist.add("Krish");
		
		for (String name : nameslist) {
			System.out.println(name);
		}
		
		Collections.sort(nameslist);
		
		System.out.println("After sorting..");
		
		for (String name : nameslist) {
			System.out.println(name);
		}
		
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp3);
		emplist.add(emp1);
		emplist.add(emp2);
		
		
		Collections.sort(emplist);
		
		for (Employee employee : emplist) {
			System.out.println(employee.getId());
		}		
	
	}

}
