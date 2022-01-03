package service.ipml;

import bean.Division;
import bean.EducationDegree;
import bean.Employee;
import bean.Position;
import repository.EmployeeRepository;
import repository.ipml.EmployeeRepositoryIpml;
import service.EmployeeService;

import java.util.List;

public class EmployeeServiceIpml implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryIpml();
    @Override
    public List<Employee> displayEmployeeList() {
        return this.employeeRepository.displayEmployeeList();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public List<Position> getAllPosition() {
        return this.employeeRepository.getAllPosition();
    }

    @Override
    public List<Division> getAllDivision() {
        return this.employeeRepository.getAllDivision();
    }

    @Override
    public List<EducationDegree> getAllEducationDegree() {
        return this.employeeRepository.getAllEducationDegree();
    }

    @Override
    public void removeEmployee(String employeeId) {
        employeeRepository.removeEmployee(employeeId);
    }

    @Override
    public Employee updateEmployeeById(String employeeId) {
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public List<Employee> findByName(String name) {
        return null;
    }
}
