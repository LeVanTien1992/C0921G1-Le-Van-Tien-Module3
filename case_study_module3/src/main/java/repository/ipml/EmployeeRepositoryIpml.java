package repository.ipml;

import bean.Division;
import bean.EducationDegree;
import bean.Employee;
import bean.Position;
import repository.DBConnect;
import repository.EmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryIpml implements EmployeeRepository {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Employee> getAllEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        String query = "select *\n" +
                "from employee e join position p\n" +
                "on e.position_id = p.position_id join education_degree ed\n" +
                "on e.education_degree_id = ed.education_degree_id join division d \n" +
                "on e.division_id = d.division_id;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                employeeList.add(new Employee(rs.getInt("employee_id"),
                        rs.getString("employee_name"),
                        rs.getString("employee_birthday"),
                        rs.getString("employee_id_card"),
                        rs.getDouble("employee_salary"),
                        rs.getString("employee_phone"),
                        rs.getString("employee_email"),
                        rs.getString("employee_address"),
                        new Position(rs.getInt("position_id"),
                                rs.getString("position_name"),
                                new EducationDegree(rs.getInt("education_degree_id"),
                                        rs.getString("education_degree_name"),
                                        new Division(rs.getInt("division_id"),
                                                rs.getString("division_name"))))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeList;
    }
    @Override
    public List<Employee> displayEmployeeList() {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {

    }
}
