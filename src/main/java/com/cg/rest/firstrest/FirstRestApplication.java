package com.cg.rest.firstrest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.rest.firstrest.address.Address;
import com.cg.rest.firstrest.employee.Employee;
import com.cg.rest.firstrest.employee.repository.EmployeeRepository;

@SpringBootApplication
public class FirstRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner populateData(EmployeeRepository repository)
	{
		return (arg)-> {
			repository.save(new Employee(103,"hema",34000,new Address(5,"nellore",54)));
			repository.save(new Employee(104,"sema",65000,new Address(8,"chittore",4)));
			repository.save(new Employee(105,"rama",6780,new Address(9,"nellore",52)));
		};
	}

}

