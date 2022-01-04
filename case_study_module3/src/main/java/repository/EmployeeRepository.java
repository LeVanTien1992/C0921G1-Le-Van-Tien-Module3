package repository;

import bean.Division;
import bean.EducationDegree;
import bean.Employee;
import bean.Position;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> displayEmployeeList();
    void addEmployee(Employee employee);
    List<Position> getAllPosition();
    List<Division> getAllDivision();
    List<EducationDegree> getAllEducationDegree();
    void removeEmployee(String employeeId);
    Employee updateEmployeeById(String employeeId);
    void updateEmployee(Employee employee);
    List<Employee> findByName(String employeeName, String employeeAddress);
}
