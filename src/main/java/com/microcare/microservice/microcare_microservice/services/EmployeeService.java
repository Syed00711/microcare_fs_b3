package com.microcare.microservice.microcare_microservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microcare.microservice.microcare_microservice.db.EmployeeJPA;
import com.microcare.microservice.microcare_microservice.entity.Employee;
import com.microcare.microservice.microcare_microservice.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeJPA ej;
	
	
	@Autowired
	EmployeeRepo er;
	public List<Employee> getEmployees(){
		return ej.getEmployees();
	}
	
	public long getEmployeeCOunt() {
		return ej.getEmployeesCount();
	}
	
	public void deleteEmployee(int empId) {
		ej.deleteEmployee(empId);
	}
	
	public List<Employee> getCustomEMp(){
		return er.getCustomEMployee()
;	}

}
