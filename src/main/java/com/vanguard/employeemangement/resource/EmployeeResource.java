package com.vanguard.employeemangement.resource;

import com.vanguard.employeemangement.models.Employee;
import com.vanguard.employeemangement.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {

    private EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployeeI(@RequestBody Employee employee)
    {
        return  new ResponseEntity(employeeService.saveEmplooyee(employee), HttpStatus.CREATED);

    }
}
