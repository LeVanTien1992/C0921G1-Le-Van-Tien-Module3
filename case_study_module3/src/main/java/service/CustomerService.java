package service;

import bean.Customer;
import bean.CustomerType;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface CustomerService {
    List<Customer> displayCustomer();
    void removeCustomer(String customerId);
    Map<String, String> addCustomer(Customer customer);
    Customer updateCustomerById(String customerId);
    void updateCustomer(Customer customer);
    List<Customer> findByName( String customerName);
    List<CustomerType> getAllCustomerType();
}
