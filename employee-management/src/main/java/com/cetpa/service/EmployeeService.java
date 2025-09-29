package com.cetpa.service;

import java.util.List;

import com.cetpa.entity.Employee;

public interface EmployeeService 
{
	void saveRecord(Employee employee);
	List<Employee> getList();
	Employee getRecord(int eid);
	void deleteRecord(int eid);
	void updateRecord(Employee nemp);
}
