package service;

import bean.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> displayEmployeeList();
    void addEmployee(Employee employee);
}
