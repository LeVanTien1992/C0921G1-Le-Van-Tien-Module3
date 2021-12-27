package controller;

import bean.Customer;
import service.CustomerService;
import service.ipml.CustomerServieIpml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer", "/"})
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServieIpml();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        switch (actionUser) {
            case "create":
                creatCustomer(request, response);
                break;
            case "search":
                searchCustomer(request, response);
                break;
            case "update":
                updateCustomer(request, response);
                break;
            case "sort":
                sortCustomerByName(response, request);
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        switch (actionUser) {
            case "create":
                showFormCreate(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "edit":
                updateCustomerById(request, response);
                break;
            case "view":
                viewCustomer(request, response);
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }

    public void listCustomer(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException {

        request.setAttribute("listC", customerService.diplayCustomer());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    public void creatCustomer(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException {
        String cName = request.getParameter("nameCustomer");
        String cEmail = request.getParameter("emailCustomer");
        String cCounrty = request.getParameter("countryCustomer");
        CustomerService customerService = new CustomerServieIpml();
        customerService.addCustomer(cName, cEmail, cCounrty);
        response.sendRedirect("customer");
    }

    public void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        request.getRequestDispatcher("view.jsp").forward(request, response);
    }

    public void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
        String country = request.getParameter("search");
        CustomerService customerService = new CustomerServieIpml();
        List<Customer> customerList= customerService.findByName(country);
        request.setAttribute("listC", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    public void deleteCustomer(HttpServletRequest request, HttpServletResponse response)throws SecurityException, IOException{
        String id = request.getParameter("did");
        CustomerService customerService = new CustomerServieIpml();
        customerService.remove(id);
        response.sendRedirect("customer");
    }

    public void updateCustomerById(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
        String id = request.getParameter("uid");
        CustomerService customerService = new CustomerServieIpml();
        Customer customer = customerService.updateCustomerById(id);
        request.setAttribute("cl", customer);
        try {
            request.getRequestDispatcher("update.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    public void updateCustomer(HttpServletRequest request, HttpServletResponse response)throws SecurityException, IOException{
        String cId = request.getParameter("id");
        String cName = request.getParameter("name");
        String cEmail = request.getParameter("email");
        String cCountry = request.getParameter("country");

        CustomerService customerService = new CustomerServieIpml();
        customerService.updateCustomer(cId, cName, cEmail, cCountry);
        response.sendRedirect("customer");
    }

    public void viewCustomer(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
        String id = request.getParameter("vid");
        CustomerService customerService = new CustomerServieIpml();
        Customer customer = customerService.updateCustomerById(id);
        request.setAttribute("vCustomer", customer);
        try {
            request.getRequestDispatcher("view.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    public void sortCustomerByName(HttpServletResponse response, HttpServletRequest request) throws SecurityException, IOException{
        String name = request.getParameter("byName");
        CustomerService customerService = new CustomerServieIpml();
        List<Customer> customerList = customerService.sortByName(name);
        request.setAttribute("sortList", customerList);
        response.sendRedirect("customer");
    }

}
