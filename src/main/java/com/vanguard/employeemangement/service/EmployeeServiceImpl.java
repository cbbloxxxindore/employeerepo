package com.vanguard.employeemangement.service;

import com.vanguard.employeemangement.models.Employee;
import com.vanguard.employeemangement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl  implements  EmployeeService{
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmplooyee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
