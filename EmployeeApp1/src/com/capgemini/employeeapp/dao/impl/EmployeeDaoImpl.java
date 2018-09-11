package com.capgemini.employeeapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.employeeapp1.dao.EmployeeDao;
import com.capgemini.employeeapp1.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private List<Employee> employees = new ArrayList<>();

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee findEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		for(Employee employee : employees) {
			if(employee.getEmployeeId() == employeeId) {
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
		// TODO Auto-generated method stub
		return null;
	}

	
}