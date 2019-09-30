package com.capgemini.tracker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.tracker.pojo.EmployeePojo;

@Repository

public interface EmployeeRepository extends MongoRepository<EmployeePojo, Integer>

{
	public EmployeePojo findByemployeeId(int employeeId);

	public void delete(EmployeePojo deleted);

}
