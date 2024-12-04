package com.microcare.microservice.microcare_microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microcare.microservice.microcare_microservice.entity.Employee;
import com.microcare.microservice.microcare_microservice.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	@GetMapping("/api/jpa/employees")
	public List<Employee> getEmployees(){
		return es.getEmployees();
	}
	

	@GetMapping("/api/jpa/employee/count")
	public long getEmployeesCOunt(){
		return es.getEmployeeCOunt();
	}
	
	@DeleteMapping("/api/jpa/employee/{empId}")
	public String deleteEmployee(@PathVariable("empId") int empId){
		 es.deleteEmployee(empId);
		 return "Employee Deleted";
	}
	
	@GetMapping("/api/jpa/customemp")
	public List<Employee> getCustomEmp(){
		return es.getCustomEMp();
	}

}
