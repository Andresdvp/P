package com.Andres_Carnes.AndresC.Services;

import com.Andres_Carnes.AndresC.Entities.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnployeeService {
    Employee employee1;
    Employee employee2;
    List<Employee> employeeList;

    public EnployeeService() {

        this.employee1 = new Employee (1,"Andres", "Andres@gmail.com", new Date(), new Date(),null);
        this.employee2= new Employee(2,"Maria", "Maria@gmail.com", new Date(), new Date(),null);
        this.employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);

    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
