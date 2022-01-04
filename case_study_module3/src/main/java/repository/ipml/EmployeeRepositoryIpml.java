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
                "on e.division_id = d.division_id\n" +
                "order by employee_id asc;";

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
                                rs.getString("position_name")),
                        new Division(rs.getInt("division_id"),
                                rs.getString("division_name")),
                        new EducationDegree(rs.getInt("education_degree_id"),
                                rs.getString("education_degree_name"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeList;
    }


    @Override
    public List<Employee> displayEmployeeList() {
        return new ArrayList<>(getAllEmployee());
    }

    @Override
    public void addEmployee(Employee employee) {
        String query = "insert into employee (employee_name, employee_birthday, employee_id_card, employee_salary,employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id)\n" +
                "values\n" +
                "(?,?,?,?,?,?,?,?,?,?);";


        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, employee.getEmployeeName());
            ps.setString(2, employee.getEmployeeDateOfBirth());
            ps.setString(3, employee.getEmployeeIdCard());
            ps.setDouble(4, employee.getEmployeeSalary());
            ps.setString(5, employee.getEmployeePhoneNumber());
            ps.setString(6, employee.getEmployeeEmail());
            ps.setString(7, employee.getEmployeeAddress());
            ps.setInt(8, employee.getPosition().getPositionId());
            ps.setInt(9, employee.getEducationDegree().getEducationDegreeId());
            ps.setInt(10, employee.getDivision().getDivisionId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Position> getAllPosition() {
        List<Position> positionList = new ArrayList<>();
        String query = "select *\n" +
                "from position;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                positionList.add(new Position(rs.getInt("position_id"),
                        rs.getString("position_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return positionList;
    }

    @Override
    public List<Division> getAllDivision() {
        List<Division> divisionList = new ArrayList<>();
        String query = "select *\n" +
                "from division; ";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                divisionList.add(new Division(rs.getInt("division_id"),
                        rs.getString("division_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return divisionList;
    }


    @Override
    public List<EducationDegree> getAllEducationDegree() {
        List<EducationDegree> educationDegreeList = new ArrayList<>();
        String query = "select * \n" +
                "from education_degree;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                educationDegreeList.add(new EducationDegree(rs.getInt("education_degree_id"),
                        rs.getString("education_degree_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return educationDegreeList;
    }

    @Override
    public void removeEmployee(String employeeId) {
        String query = "delete from employee\n" +
                "where employee_id = ?;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, employeeId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee updateEmployeeById(String employeeId) {
        String query = "select *\n" +
                "from employee e join position p\n" +
                "on e.position_id = p.position_id join education_degree ed\n" +
                "on e.education_degree_id = ed.education_degree_id join division d \n" +
                "on e.division_id = d.division_id\n" +
                "where employee_id = ?;";
        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, employeeId);
            rs = ps.executeQuery();
            while (rs.next()){
                return new Employee(rs.getInt("employee_id"),
                        rs.getString("employee_name"),
                        rs.getString("employee_birthday"),
                        rs.getString("employee_id_card"),
                        rs.getDouble("employee_salary"),
                        rs.getString("employee_phone"),
                        rs.getString("employee_email"),
                        rs.getString("employee_address"),
                        new Position(rs.getInt("position_id"),
                                rs.getString("position_name")),
                        new Division(rs.getInt("division_id"),
                                rs.getString("division_name")),
                        new EducationDegree(rs.getInt("education_degree_id"),
                                rs.getString("education_degree_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {
        String query = "update employee\n" +
                "set employee_name = ?,\n" +
                "employee_birthday = ?,\n" +
                "employee_id_card = ?,\n" +
                "employee_salary = ?,\n" +
                "employee_phone = ?,\n" +
                "employee_email = ?,\n" +
                "employee_address = ?,\n" +
                "position_id = ?,\n" +
                "education_degree_id = ?,\n" +
                "division_id = ?\n" +
                "where employee_id = ?;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, employee.getEmployeeName());
            ps.setString(2, employee.getEmployeeDateOfBirth());
            ps.setString(3, employee.getEmployeeIdCard());
            ps.setDouble(4, employee.getEmployeeSalary());
            ps.setString(5, employee.getEmployeePhoneNumber());
            ps.setString(6, employee.getEmployeeEmail());
            ps.setString(7, employee.getEmployeeAddress());
            ps.setInt(8, employee.getPosition().getPositionId());
            ps.setInt(9, employee.getEducationDegree().getEducationDegreeId());
            ps.setInt(10, employee.getDivision().getDivisionId());
            ps.setInt(11, employee.getEmployeeId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> findByName(String employeeName, String employeeAddress) {
        List<Employee> employeeList = new ArrayList<>();
        String query = "select *\n" +
                "from employee e join position p\n" +
                "on e.position_id = p.position_id join education_degree ed\n" +
                "on e.education_degree_id = ed.education_degree_id join division d \n" +
                "on e.division_id = d.division_id\n" +
                "where (employee_name like ?) and (employee_address like ?);";
        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, "%"+employeeName+"%");
            ps.setString(2, "%"+employeeAddress+"%");
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
                                rs.getString("position_name")),
                        new Division(rs.getInt("division_id"),
                                rs.getString("division_name")),
                        new EducationDegree(rs.getInt("education_degree_id"),
                                rs.getString("education_degree_name"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeList;
    }


    public static void main(String[] args) {
//        EmployeeRepositoryIpml employeeRepositoryIpml = new EmployeeRepositoryIpml();
//        List<Employee> employeeList = employeeRepositoryIpml.updateEmployeeById();
//        for (Employee employee: employeeList){
//            System.out.println(employee);
//        }
    }
}
