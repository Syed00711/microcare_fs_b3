package com.microcare.microservice.microcare_microservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.microcare.microservice.microcare_microservice.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

	@Query(nativeQuery=true,value="select * from employee9 where employeeid>5")
	List<Employee> getCustomEMployee();
}
