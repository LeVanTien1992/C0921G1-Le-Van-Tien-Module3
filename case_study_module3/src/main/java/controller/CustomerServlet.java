package controller;

import bean.Customer;
import bean.CustomerType;
import service.CustomerService;
import service.ipml.CustomerServiceIpml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "CustomerServlet" , urlPatterns = {"/customer", "/"})
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceIpml();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if(actionUser == null){
            actionUser = "";
        }switch (actionUser){
            case "create":
                createCustomer(request, response);
                break;
            case "update":
                updateCustomer(request, response);
                break;
            case "search":
                searchCustomerByName(request, response);
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if(actionUser == null){
            actionUser = "";
        }switch (actionUser){
            case "showList":
                listCustomer(request, response);
                break;
            case "showFormCustomer":
                showFormCreateCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "formUpdateById":
                updateCustomerById(request, response);
                break;
            default:
               viewHomeFurama(request, response);
                break;
        }
    }

    public void listCustomer(HttpServletRequest request, HttpServletResponse response)throws ServletException , IOException{
        CustomerService customerService = new CustomerServiceIpml();
        List<Customer> customerList = customerService.displayCustomer();
        request.setAttribute("cList", customerList);
        request.getRequestDispatcher("customerHome.jsp").forward(request, response);
    }

    public void viewHomeFurama(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    public void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String customerId = request.getParameter("did");
        CustomerService customerService = new CustomerServiceIpml();
        customerService.removeCustomer(customerId);
       response.sendRedirect("/customer?actionUser=showList");
    }

    public void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        CustomerService customerService = new CustomerServiceIpml();
        Customer customer = new Customer();
        customer.setCustomerName(request.getParameter("customerName"));
        customer.setCustomerDateOfBirth(request.getParameter("customerDateOfBirth"));
        customer.setCustomerGender(Integer.parseInt(request.getParameter("customerGender")));
        customer.setCustomerIdCard(request.getParameter("customerIdCard"));
        customer.setCustomerPhoneNumber(request.getParameter("customerPhoneNumber"));
        customer.setCustomerEmail(request.getParameter("customerEmail"));
        customer.setCustomerAddress(request.getParameter("customerAddress"));
        CustomerType customerType = new CustomerType();
        customerType.setCustomerTypeId(Integer.parseInt(request.getParameter("cl")));
        customer.setCustomerType(customerType);
        customerService.addCustomer(customer);
        response.sendRedirect("custommer?actionUser=showList");
    }
    public void showFormCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        CustomerService customerService = new CustomerServiceIpml();
        List<CustomerType> customerTypeList = customerService.getAllCustomerType();
        request.setAttribute("tony", customerTypeList);
        request.getRequestDispatcher("createCustomer.jsp").forward(request, response);
    }

    public void updateCustomerById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String customerId = request.getParameter("uid");
        CustomerService customerService = new CustomerServiceIpml();
        Customer customer = customerService.updateCustomerById(customerId);
        request.setAttribute("cl", customer);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }
    public void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        CustomerService customerService = new CustomerServiceIpml();
        Customer customer = new Customer();
        customer.setCustomerId(Integer.parseInt(request.getParameter("customerId")));
        customer.setCustomerName(request.getParameter("customerName"));
        customer.setCustomerDateOfBirth(request.getParameter("customerDateOfBirth"));
        customer.setCustomerGender(Integer.parseInt(request.getParameter("customerGender")));
        customer.setCustomerIdCard(request.getParameter("customerIdCard"));
        customer.setCustomerPhoneNumber(request.getParameter("customerPhoneNumber"));
        customer.setCustomerEmail(request.getParameter("customerEmail"));
        customer.setCustomerAddress(request.getParameter("customerAddress"));
        CustomerType customerType = new CustomerType();
        customerType.setCustomerTypeId(Integer.parseInt(request.getParameter("customerTypeId")));
        customer.setCustomerType(customerType);
        customerService.updateCustomer(customer);
        response.sendRedirect("customer?actionUser=showList");
    }
    public void searchCustomerByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String customerName = request.getParameter("search");
        CustomerService customerService = new CustomerServiceIpml();
        List<Customer> customerList = customerService.findByName(customerName);
        request.setAttribute("cList", customerList);
        request.getRequestDispatcher("customerHome.jsp").forward(request,response);
    }


}
