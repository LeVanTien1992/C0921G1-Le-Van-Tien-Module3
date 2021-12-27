package repository.ipml;

import bean.Customer;
import repository.CustomerRepository;
import repository.DBConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryIpml implements CustomerRepository {
    Connection connection = null;
    PreparedStatement ps =  null;
    ResultSet rs = null;

    public List<Customer> getAllCustomer(){
        List<Customer> customerList = new ArrayList<>();
        String query = "SELECT * FROM customer_management.customer;";
        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            rs =ps.executeQuery();
            while (rs.next()){
                customerList.add(new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        }catch (Exception e){
            e.getMessage();
        }
        return customerList;
    }


    @Override
    public List<Customer> displayCustomer() {
        return new ArrayList<>(getAllCustomer());
    }

    @Override
    public void addCustomer(String name, String email, String country) {
        String query = "insert into customer(`name`, email, country)\n" +
                "values\n" +
                "(?, ?, ?);";
        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, country);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Customer> findByName(String country) {
        List<Customer> customerList = new ArrayList<>();
        String query ="select * \n" +
                "from customer\n" +
                "where country like ?;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, "%"+country+"%");
            rs = ps.executeQuery();
            while (rs.next()){
                customerList.add(new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public Customer updateCustomerById(String id) {
        String query = "select *\n" +
                "from customer\n" +
                "where id = ?;\n";
        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()){
                return new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


    @Override
    public void updateCustomer(String id, String name, String email, String country) {
        String query = "update customer \n" +
                "set `name`= ?,\n" +
                "email = ?,\n" +
                "country = ?\n" +
                "where id =?;";
        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, country);
            ps.setString(4, id);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void remove(String id) {
        String query = "delete  \n" +
                "from customer\n" +
                "where id = ?;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Customer> sortByName(String name) {
        List<Customer> customerList = new ArrayList<>();
        String query = "select *\n" +
                "from customer\n" +
                "order by ?;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()){
                customerList.add(new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return customerList;
    }
}
