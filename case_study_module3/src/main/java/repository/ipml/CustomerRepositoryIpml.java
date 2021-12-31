package repository.ipml;

import bean.Customer;
import bean.CustomerType;
import repository.CustomerRepository;
import repository.DBConnect;
import service.CustomerService;
import service.ipml.CustomerServiceIpml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerRepositoryIpml implements CustomerRepository {
    Connection connection = null;
    PreparedStatement ps =  null;
    ResultSet rs = null;

    public List<Customer> getAllCustomer(){
        List<Customer> customerList = new ArrayList<>();
        String query = "select *\n" +
                "from customer c join customer_type ct\n" +
                "on c.customer_type_id = ct.customer_type_id\n" +
                "order by customer_id asc;";
//        int customerId, String customerName, Date customerDateOfBirth, String customerGender,
//                String customerIdCard, String customerPhoneNumber, String customerEmail,
//                String customerAddress, CustomerType customerType

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                customerList.add(new Customer(rs.getInt("customer_id"),
                        rs.getString("customer_name"),
                        rs.getString("customer_birthday"),
                        rs.getInt("customer_gender"),
                        rs.getString("customer_id_card"),
                        rs.getString("customer_phone"),
                        rs.getString("customer_email"),
                        rs.getString("customer_address"),
                        new CustomerType(rs.getInt("customer_type_id"),
                                rs.getString("customer_type_name"))));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }


    public static void main(String[] args) {
        CustomerRepositoryIpml customerRepositoryIpml = new CustomerRepositoryIpml();

    }
    @Override
    public List<Customer> displayCustomer() {
        return new ArrayList<>(getAllCustomer());
    }

    @Override
    public void removeCustomer(String customerId) {
        String query = "delete from customer \n" +
                "where customer_id = ?;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, customerId);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addCustomer(Customer customer) {
        String query = "insert into customer(customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email,customer_address, customer_type_id)\n" +
                "values\n" +
                "(?,?,?,?,?,?,?,?);";
        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1,customer.getCustomerName());
            ps.setString(2,customer.getCustomerDateOfBirth());
            ps.setInt(3,customer.getCustomerGender());
            ps.setString(4,customer.getCustomerIdCard());
            ps.setString(5,customer.getCustomerPhoneNumber());
            ps.setString(6,customer.getCustomerEmail());
            ps.setString(7,customer.getCustomerAddress());
            ps.setInt(8,customer.getCustomerType().getCustomerTypeId());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Customer updateCustomerById(String customerId) {
        String query = "select *\n" +
                "from customer c join customer_type ct\n" +
                "on c.customer_type_id = ct.customer_type_id\n"+
                "where customer_id = ?;";
        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, customerId);
            rs = ps.executeQuery();
            while (rs.next()){
                return new Customer(rs.getInt("customer_id"),
                        rs.getString("customer_name"),
                        rs.getString("customer_birthday"),
                        rs.getInt("customer_gender"),
                        rs.getString("customer_id_card"),
                        rs.getString("customer_phone"),
                        rs.getString("customer_email"),
                        rs.getString("customer_address"),
                        new CustomerType(rs.getInt("customer_type_id"),
                                rs.getString("customer_type_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {
        String query = "update customer \n" +
                "set customer_name = ?,\n" +
                "customer_birthday = ?,\n" +
                "customer_gender = ?,\n" +
                "customer_id_card = ?,\n" +
                "customer_phone = ?,\n" +
                "customer_email = ?,\n" +
                "customer_address = ?,\n" +
                "customer_type_id = ?\n" +
                "where customer_id = ?;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1,customer.getCustomerName());
            ps.setString(2, customer.getCustomerDateOfBirth());
            ps.setInt(3, customer.getCustomerGender());
            ps.setString(4, customer.getCustomerIdCard());
            ps.setString(5, customer.getCustomerPhoneNumber());
            ps.setString(6, customer.getCustomerEmail());
            ps.setString(7, customer.getCustomerAddress());
            ps.setInt(8,customer.getCustomerType().getCustomerTypeId());
            ps.setInt(9, customer.getCustomerId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findByName(String customerName) {
        List<Customer> customerList = new ArrayList<>();
        String query = "select * \n" +
                "from customer c join customer_type ct\n" +
                "on c.customer_type_id = ct.customer_type_id \n" +
                "where customer_name like ?;";
        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, "%"+customerName+"%");
            rs = ps.executeQuery();
            while (rs.next()){
                customerList.add(new Customer(rs.getInt("customer_id"),
                        rs.getString("customer_name"),
                        rs.getString("customer_birthday"),
                        rs.getInt("customer_gender"),
                        rs.getString("customer_id_card"),
                        rs.getString("customer_phone"),
                        rs.getString("customer_email"),
                        rs.getString("customer_address"),
                        new CustomerType(rs.getInt("customer_type_id"),
                                rs.getString("customer_type_name"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public List<CustomerType> getAllCustomerType() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        String query = "select *\n" +
                "from customer_type;";

        try {
            connection = new DBConnect().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                customerTypeList.add(new CustomerType(rs.getInt("customer_type_id"),
                        rs.getString("customer_type_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypeList;
    }

}
