package service.ipml;

import bean.Customer;
import bean.CustomerType;
import repository.CustomerRepository;
import repository.ipml.CustomerRepositoryIpml;
import service.CustomerService;

import java.util.Date;
import java.util.List;

public class CustomerServiceIpml implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryIpml();
    @Override
    public List<Customer> displayCustomer() {
        return this.customerRepository.displayCustomer();
    }

    @Override
    public void removeCustomer(String customerId) {
        customerRepository.removeCustomer(customerId);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    @Override
    public Customer updateCustomerById(String customerId) {
        return this.customerRepository.updateCustomerById(customerId);
    }

    @Override
    public void updateCustomer(Customer customer) {

    }


    @Override
    public List<Customer> findByName(String customerName) {
        return this.customerRepository.findByName(customerName);
    }


}
