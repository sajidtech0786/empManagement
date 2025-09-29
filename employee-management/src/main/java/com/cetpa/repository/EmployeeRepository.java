package com.cetpa.repository;

import java.util.List;

import com.cetpa.entity.Employee;

public interface EmployeeRepository 
{
	void saveEmployee(Employee employee);
	List<Employee> getEmployeeList();
	Employee getEmployee(int eid);
	void deleteEmployee(Employee employee);
	void updateEmployee(Employee nemp, Employee oemp);
}
