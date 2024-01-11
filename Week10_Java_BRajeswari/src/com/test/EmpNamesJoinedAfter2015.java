package com.test;

import java.util.List;

public class EmpNamesJoinedAfter2015 {
	
	public void getEmpNames(List<Employee> employeeList) {
		
		employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).
		forEach(employee -> System.out.println(employee.getName()));
		
	}

	public static void main(String[] args) {
		
		List<Employee> employeeList = GetEmployees.getEmployeeList();
		EmpNamesJoinedAfter2015 empNamesJoinedAfter2015 = new EmpNamesJoinedAfter2015();
		empNamesJoinedAfter2015.getEmpNames(employeeList);
		
		
	}

}
