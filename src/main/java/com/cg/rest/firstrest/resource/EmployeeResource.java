package com.cg.rest.firstrest.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.firstrest.employee.Employee;
import com.cg.rest.firstrest.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees") // Addressable resource
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@PostMapping // uniform constrain interface
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}

	@RequestMapping // uniform constrain interface
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@DeleteMapping("/{employeeId}")
	public void deleteEmployee(@PathVariable int employeeId) {
		service.deleteEmployee(employeeId);
	}

	@PutMapping("/{employeeId}")
	public void updateEmployee(@RequestBody Employee employee) {
		service.updateCustomer(employee);
	}

}
