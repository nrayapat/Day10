package com.capgemini.employeeapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.employeeapp.dao.EmployeeDeo;
import com.capgemini.employeeapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDeo {
	private List<Employee> employees=new ArrayList<>();
	
@Override
public List<Employee> findAllEmployees() {
	
	return employees;
}
@Override
public Employee findEmployeeById(int employeeId) {
	
	for(Employee employee:employees)
	{
		if(employee.getEmployeeid()==employeeId)
		{
			return employee;
			
		}
	}
	return null;
}
@Override
public boolean deleteEmployee(int employeeid) {
	for(Employee employee:employees)
	{
		if(employee.getEmployeeid()==employeeid)
		{
			employees.remove(employee);
			return true;
			
		}
	}
	return false;
}
@Override
public boolean addEmployee(Employee employee) {
	
	
	return employees.add(employee);
}
@Override
public Employee updateEmployee(Employee employee) {
	
	for(Employee e:employees)
	{
		if(e.getEmployeeid()==employee.getEmployeeid())
		{
			e.setEmployeeName(employee.getEmployeeName());
			e.setEmployeeSalary(employee.getEmployeeSalary());
			e.setEmployeeDepartment(employee.getEmployeeDepartment());
			
		}
		return e;	
	}
	return null;
}

}