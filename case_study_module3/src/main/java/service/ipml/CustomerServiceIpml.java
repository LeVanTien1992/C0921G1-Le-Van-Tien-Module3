package service.ipml;

import bean.Customer;
import bean.CustomerType;
import repository.CustomerRepository;
import repository.ipml.CustomerRepositoryIpml;
import service.CustomerService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String, String> addCustomer(Customer customer) {
        Map<String, String > messageMap = new HashMap<>();

        if(!customer.getCustomerName().matches("[A-Za-z ]+")){
            messageMap.put("name", "Invalid name format");
        }
        if("".equals(customer.getCustomerDateOfBirth())){
            messageMap.put("dateOfBirth", "Please input dateOfBirth");
        }

        if(messageMap.isEmpty()){
            customerRepository.addCustomer(customer);
        }
        return messageMap;
    }

    @Override
    public Customer updateCustomerById(String customerId) {
        return this.customerRepository.updateCustomerById(customerId);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.updateCustomer(customer);
    }


    @Override
    public List<Customer> findByName(String customerName) {
        return this.customerRepository.findByName(customerName);
    }

    @Override
    public List<CustomerType> getAllCustomerType() {
        return customerRepository.getAllCustomerType();
    }

    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceIpml();
        List<CustomerType> customerTypeList = customerService.getAllCustomerType();
        for (CustomerType customerType: customerTypeList){
            System.out.println(customerType);
        }
    }

}
