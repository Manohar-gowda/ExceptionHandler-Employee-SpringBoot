package com.Javainterviewpoint;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import com.Javainterviewpoint.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService
{
    Map<String, Employee> employeeMap = new HashMap<String, Employee>();

    @PostConstruct
    void initialize() {
        Employee emp1 = new Employee("John", 11);
        Employee emp2 = new Employee("James", 22);
        Employee emp3 = new Employee("Manohar", 20);
        employeeMap.put("John", emp1);
        employeeMap.put("James", emp2);
        employeeMap.put("Manohar", emp3);
    }

    public Employee getEmployee (String name) throws Exception
    {
        return employeeMap.get(name);
    }
}