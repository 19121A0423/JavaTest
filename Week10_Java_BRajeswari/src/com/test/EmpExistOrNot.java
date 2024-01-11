package com.test;

import java.util.List;
import java.util.Optional;

public class EmpExistOrNot {
	
	public boolean empPresentOrNot(List<Employee> employeeList , String name) {
		
		Optional<Employee>  employee = employeeList.stream().filter(emp -> emp.getName().equals(name)).findFirst();
		return employee.isPresent();
	}

}
