package com.examble.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj = new Employee();


		obj.name = "Suresh";
		obj.id = 007;
		obj.salary = 50000.00;


		obj.printName();
		obj.printSalary();
		
	}

}
