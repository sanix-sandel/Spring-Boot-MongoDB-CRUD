package com.sanix.crudapp.repositories;

import com.sanix.crudapp.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {
}
