package com.test;

import java.util.List;
import java.util.stream.Collectors;

public class MaleAndFemaleCount {
	
	public void getCount(List<Employee> employeeList) {
		
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.counting())).
		entrySet().forEach(entry -> System.out.println(entry.getKey() +" : " + entry.getValue()));
		
	}

	public static void main(String[] args) {
		
		List<Employee> employeeList = GetEmployees.getEmployeeList();
		MaleAndFemaleCount maleAndFemaleCount = new MaleAndFemaleCount();
		maleAndFemaleCount.getCount(employeeList);

	}

}
