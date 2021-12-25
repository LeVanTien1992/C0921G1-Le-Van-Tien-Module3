package connect_woker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnect {
    public Connection getDBConnect(){
        final String url = "jdbc:mysql://localhost:3306/worker_management";
        final String user = "root";
        final String pass = "levantien341992";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public List<Employee> getAll(){
        List<Employee> employeeList = new ArrayList<>();
        String query = "SELECT * FROM worker_management.employee";
        Connection connection = null;
        PreparedStatement ps =  null;
        ResultSet rs = null;

        try {
            connection = new DBConnect().getDBConnect();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                employeeList.add(new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    // tạo hàm delete để thực hiện xóa nhân viên cần xóa
    public void deleteEmployee(String id){
        String query = "delete from employee\n" +
                "where id = ?";
        Connection connection = null;
        PreparedStatement ps =  null;
        ResultSet rs = null;

        try {
            connection = new DBConnect().getDBConnect();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.executeLargeUpdate(); // đối với hàm không có trả về gi thì dùng execute
        }catch (Exception e){
            e.getMessage();
        }
    }
    // tạo hàm thêm để thêm nhân viên
    public void addEmployee( String name, String salary,
                            String phoneNumber, String email, String address){
        String query = "insert into employee(name_employee, salary, phone_number, email, address)\n" +
                "values(?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement ps =  null;
        ResultSet rs = null;
        try {
            connection = new DBConnect().getDBConnect();
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, salary);
            ps.setString(3, phoneNumber);
            ps.setString(4, email);
            ps.setString(5, address);
            ps.executeLargeUpdate(); // đối với hàm không có trả về gi thì dùng execute
        }catch (Exception e){
            e.getMessage();
        }
    }

    // tạo hàm để lấy thông tin nhân viên hiện thi khi ta update
    public Employee getEmployeeId(String id){
        String query = "select * \n" +
                "from employee\n" +
                "where id = ?";
        Connection connection = null;
        PreparedStatement ps =  null;
        ResultSet rs = null;

        try {
            connection = new DBConnect().getDBConnect();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()){
                return new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        }catch (Exception e){
            e.getMessage();
        }
        return null;
    }

    public void updateEmployee(String id, String name, String salary,
                               String phoneNumber, String email, String address){
        String query = "update employee\n" +
                "set name_employee = ?,\n" +
                "salary = ?,\n" +
                "phone_number = ?,\n" +
                "email = ?,\n" +
                "address = ?\n" +
                "where id = ?";
        Connection connection = null;
        PreparedStatement ps =  null;
        ResultSet rs = null;

        try {
            connection = new DBConnect().getDBConnect();
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, salary);
            ps.setString(3, phoneNumber);
            ps.setString(4, email);
            ps.setString(5, address);
            ps.setString(6, id);
            ps.executeLargeUpdate();
        }catch (Exception e){
            e.getMessage();
        }
    }


    public static void main(String[] args) {
       DBConnect dbConnect = new DBConnect();
       Employee e = dbConnect.getEmployeeId("1");
        System.out.println(e);
//       List<Employee> employeeList = dbConnect.getAll();
//        for (Employee employee:employeeList) {
//            System.out.println(employee);
//        }
    }
}
