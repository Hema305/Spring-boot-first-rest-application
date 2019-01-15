package com.cg.rest.firstrest.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.cg.rest.firstrest.employee.Employee;
import com.cg.rest.firstrest.employee.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public void addNewEmployee(Employee employee) {
		
		repository.save(employee);
	}

	
	@Override
	public List<Employee> getAllEmployees() {
		
		return repository.findAll();
	}


	@Override
	public void updateCustomer(Employee employee) {
		repository.save(employee);
		
	}


	@Override

	public void deleteEmployee(int employeeId) {
		Employee employee=repository.getOne(employeeId);
		repository.delete(employee);
		
	}

}
