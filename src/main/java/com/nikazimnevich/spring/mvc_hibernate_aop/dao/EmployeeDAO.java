package com.nikazimnevich.spring.mvc_hibernate_aop.dao;

import com.nikazimnevich.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);

   public void deleteEmployee(int id);
}
