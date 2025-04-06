package com.assignments;

import java.util.*;

public class Assignment4_Collection {

	public static void main(String[] args) {
		
		List<String> employeeIdArrayList = new ArrayList<String>();

		employeeIdArrayList.add("E001");
		employeeIdArrayList.add("E002");
		employeeIdArrayList.add("E003");

		List<String> enamesArrayList = new ArrayList<String>();

		enamesArrayList.add("Alice Green");
		enamesArrayList.add("Bob Johnson");
		enamesArrayList.add("Carol white");

		List<Integer> ageArrayList = new ArrayList<Integer>();

		ageArrayList.add(30);
		ageArrayList.add(35);
		ageArrayList.add(28);

		List<String> genderArrayList = new ArrayList<String>();

		genderArrayList.add("Female");
		genderArrayList.add("Male");
		genderArrayList.add("Female");

		List<String> departmentArrayList = new ArrayList<String>();

		departmentArrayList.add("Engineering");
		departmentArrayList.add("Marketing");
		departmentArrayList.add("Sales");

		List<String> positionArrayList = new ArrayList<String>();

		positionArrayList.add("Software engineer");
		positionArrayList.add("Marketing manager");
		positionArrayList.add("Sales executive");

		List<Integer> salaryArrayList = new ArrayList<Integer>();

		salaryArrayList.add(75000);
		salaryArrayList.add(85000);
		salaryArrayList.add(65000);

		List<String> emailArrayList = new ArrayList<String>();

		emailArrayList.add("alice@example.com");
		emailArrayList.add("bob@example.com");
		emailArrayList.add("carol@example.com");

		System.out.println("Email : " + emailArrayList.get(1));

		List<String> contactNumberLinkedList = new LinkedList<String>();

	
		contactNumberLinkedList.add("9876543213");
	    contactNumberLinkedList.add("9876543214");
		contactNumberLinkedList.add("9876543215");
		

	}

}
