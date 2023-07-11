package com.vanguard.employeemangement.repository;

import com.vanguard.employeemangement.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {
}
