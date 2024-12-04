package com.microcare.microservice.microcare_microservice.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microcare.microservice.microcare_microservice.entity.Employee;
import com.microcare.microservice.microcare_microservice.repo.EmployeeRepo;

@Component
public class EmployeeJPA {
	@Autowired
	EmployeeRepo ep;
	
	
	public List<Employee> getEmployees(){
		return ep.findAll();
	}
	
	public long getEmployeesCount(){
		return ep.count();
	}
	
	public void deleteEmployee(int emplid) {
		ep.deleteById(emplid);
	}

}
