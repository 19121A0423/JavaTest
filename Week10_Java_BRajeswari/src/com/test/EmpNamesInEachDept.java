package com.test;

import java.util.List;
import java.util.stream.Collectors;

public class EmpNamesInEachDept {
	
	public void getNames(List<Employee> employeeList) {
		
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().
		forEach(entry -> {
			System.out.println("Department - "+entry.getKey());
			entry.getValue().forEach(employee -> System.out.println(employee.getName()));
		});
		
	}

	public static void main(String[] args) {
		
		List<Employee> employeeList = GetEmployees.getEmployeeList();
		EmpNamesInEachDept namesInEachDept = new EmpNamesInEachDept();
		namesInEachDept.getNames(employeeList);
		
	}

}
