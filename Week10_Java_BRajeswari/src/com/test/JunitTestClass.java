package com.test;

import java.util.List;

import org.junit.Test;

public class JunitTestClass {
	
	@Test
	public void test() {
		
		List<Employee> employeeList = GetEmployees.getEmployeeList();
		EmpExistOrNot empExistOrNot = new EmpExistOrNot();
		if(empExistOrNot.empPresentOrNot(employeeList, "Arjpun")) {
			System.out.println("Employee exist");
		}
		else {
			System.out.println("Employee not exist");
		}
	}

}
