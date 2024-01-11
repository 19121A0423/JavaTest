package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class YoungestEmpDetails {

	public void getYoungestEmps(List<Employee> employeeList) {

	employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().
	forEach(entry -> {
		System.out.println("Department - "+entry.getKey());
		Optional<Employee> youngestEmp = entry.getValue().stream().min(Comparator.comparing(Employee::getAge));
		System.out.println(youngestEmp.get());
	});
		

	}

	public static void main(String[] args) {

		List<Employee> employeeList = GetEmployees.getEmployeeList();
		YoungestEmpDetails youngestEmpDetails = new YoungestEmpDetails();
		youngestEmpDetails.getYoungestEmps(employeeList);

	}

}
