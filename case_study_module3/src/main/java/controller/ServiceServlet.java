package controller;

import bean.Customer;
import bean.RentType;
import bean.Service;
import bean.ServiceType;
import service.CustomerService;
import service.ServiceService;
import service.ipml.CustomerServiceIpml;
import service.ipml.ServiceServiceIpml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet" , urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    private ServiceService serviceService = new ServiceServiceIpml();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if(actionUser == null){
            actionUser = "";
        }switch (actionUser){
            case "create":
                createService(request,response);
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
            case "showFormService":
                showFormCreateService(request, response);
                break;

            default:
               listService(request, response);
                break;
        }
    }

    public void listService(HttpServletRequest request, HttpServletResponse response)throws ServletException , IOException{
       ServiceService serviceService = new ServiceServiceIpml();
       List<Service> serviceList = serviceService.displayService();
       request.setAttribute("sList", serviceList);
       request.getRequestDispatcher("serviceHome.jsp").forward(request, response);
    }

    public void showFormCreateService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ServiceService serviceService = new ServiceServiceIpml();
        List<RentType> rentTypeList = serviceService.getAllRentType();
        request.setAttribute("rentType", rentTypeList);

        List<ServiceType> serviceTypeList = serviceService.getAllServiceType();
        request.setAttribute("serviceType", serviceTypeList);

        request.getRequestDispatcher("createService.jsp").forward(request, response);
    }

    public void createService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ServiceService serviceService = new ServiceServiceIpml();
        Service service = new Service();
        service.setServiceName(request.getParameter("serviceName"));
        service.setServiceArea(Integer.parseInt(request.getParameter("serviceArea")));
        service.setServiceCost(Double.parseDouble(request.getParameter("serviceCost")));
        service.setServiceMaxPeople(Integer.parseInt(request.getParameter("serviceMaxPeople")));
        service.setServiceStandardRoom(request.getParameter("serviceStandardRoom"));
        service.setDecriptionOtherConvenience(request.getParameter("decriptionOtherConvenience"));
        service.setPoolArea(Double.parseDouble(request.getParameter("poolArea")));
        service.setNumberOfFloor(Integer.parseInt(request.getParameter("numberOfFloor")));
        RentType rentType = new RentType();
        rentType.setRentTypeId(Integer.parseInt(request.getParameter("rent")));
        service.setRentType(rentType);
        ServiceType serviceType = new ServiceType();
        serviceType.setServiceTypeId(Integer.parseInt(request.getParameter("service")));
        service.setServiceType(serviceType);
        serviceService.createService(service);
        response.sendRedirect("/service");
    }

}
