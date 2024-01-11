package com.test;

import java.util.List;
import java.util.stream.Collectors;

public class CountofMalesAndFemalesInSalesAndMarketing {
	
	public void getCountOfMalesAndFemales(List<Employee> employeeList) {
		
		employeeList.stream().filter(employee -> employee.getDepartment().equals("Sales") || 
		employee.getDepartment().equals("Marketing")).collect(Collectors.groupingBy(Employee::getDepartment,
		Collectors.groupingBy(Employee::getGender,Collectors.counting()))).entrySet().forEach(entry1 -> {
			System.out.println("Department : " + entry1.getKey());
			entry1.getValue().entrySet().forEach(entry2 -> System.out.println(entry2.getKey()+" : "+entry2.getValue()));
		});
		
	}
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = GetEmployees.getEmployeeList();
		CountofMalesAndFemalesInSalesAndMarketing salesAndMarketing = new CountofMalesAndFemalesInSalesAndMarketing();
		salesAndMarketing.getCountOfMalesAndFemales(employeeList);
		
	}

}
