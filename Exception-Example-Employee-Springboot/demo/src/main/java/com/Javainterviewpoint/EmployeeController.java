package com.Javainterviewpoint;

import java.io.IOException;

import com.Javainterviewpoint.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
    @Autowired
   EmployeeService employeeService;

    @Autowired
    Employee employee;

    @RequestMapping("/employee/{employeeName}")
    public Employee hello(@PathVariable("employeeName") String employeeName) throws Exception
    {
        if (employeeName.length() < 4)
            throw new IOException();
         employee = employeeService.getEmployee(employeeName);
        if(employee == null)
            throw new Exception();

        return employee;
    }
}
