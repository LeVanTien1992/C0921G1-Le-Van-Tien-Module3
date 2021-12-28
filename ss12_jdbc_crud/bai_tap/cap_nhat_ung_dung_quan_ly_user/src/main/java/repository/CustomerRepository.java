package repository;

import bean.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> displayCustomer();
    void addCustomer(String name, String email , String country);
    List<Customer> findByName(String country);
    Customer updateCustomerById(String id);
    void updateCustomer(String id, String name, String email , String country);
    void remove(String id);
    List<Customer> sortByName();
}
