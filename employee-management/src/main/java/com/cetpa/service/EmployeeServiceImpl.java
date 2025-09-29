package com.cetpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entity.Employee;
import com.cetpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;

	public void saveRecord(Employee employee) 
	{
		employeeRepository.saveEmployee(employee);
	}

	public List<Employee> getList() 
	{
		return employeeRepository.getEmployeeList();
	}

	public Employee getRecord(int eid) 
	{
		return employeeRepository.getEmployee(eid);
	}

	public void deleteRecord(int eid) 
	{
		Employee employee = employeeRepository.getEmployee(eid);
		employeeRepository.deleteEmployee(employee);
	}

	public void updateRecord(Employee nemp) 
	{
		Employee oemp = employeeRepository.getEmployee(nemp.getEid());
		employeeRepository.updateEmployee(nemp, oemp);
	}
}
