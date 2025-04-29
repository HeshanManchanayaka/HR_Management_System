package edu.icet.service;

import edu.icet.dto.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    List<Employee> getAll();

    void updateEmployee(Employee employee);

    Employee searchById(Integer id);

    void deleteEmployee(Integer id);
}
