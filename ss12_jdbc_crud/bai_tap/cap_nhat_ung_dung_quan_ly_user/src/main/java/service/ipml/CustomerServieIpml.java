package service.ipml;

import bean.Customer;
import repository.CustomerRepository;
import repository.ipml.CustomerRepositoryIpml;
import service.CustomerService;

import java.util.List;

public class CustomerServieIpml implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryIpml();


    @Override
    public List<Customer> diplayCustomer() {
        return this.customerRepository.displayCustomer();
    }

    @Override
    public void addCustomer(String name, String email, String country) {
        customerRepository.addCustomer(name, email, country);

    }

    @Override
    public List<Customer> findByName(String country) {
        return this.customerRepository.findByName(country);
    }

    @Override
    public Customer updateCustomerById(String id) {
        return this.customerRepository.updateCustomerById(id);
    }

    @Override
    public void updateCustomer(String id, String name, String email, String country) {
        customerRepository.updateCustomer(id, name, email, country);
    }

    @Override
    public void remove(String id) {
        customerRepository.remove(id);
    }

    @Override
    public List<Customer> sortByName( ) {
        return this.customerRepository.sortByName();
    }
}
