package com.tqpp.service;

import java.util.List;

import com.tqpp.Model.Employee;


public interface EmpService {
	
	public List<Employee> getEmpByDeptname(String d);
	void insertEmployee(Employee s);

	void deleteEmployeeById(int id);

	void updateEmployee(Employee s);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);
}
