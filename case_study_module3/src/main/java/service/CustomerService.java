package service;

import bean.Customer;
import bean.CustomerType;

import java.util.Date;
import java.util.List;

public interface CustomerService {
    List<Customer> displayCustomer();
    void removeCustomer(String customerId);
    void addCustomer(Customer customer);
    Customer updateCustomerById(String customerId);
    void updateCustomer(Customer customer);
    List<Customer> findByName( String customerName);

}
