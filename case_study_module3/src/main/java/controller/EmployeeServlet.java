package controller;

import bean.Division;
import bean.EducationDegree;
import bean.Employee;
import bean.Position;
import service.CustomerService;
import service.EmployeeService;
import service.ipml.CustomerServiceIpml;
import service.ipml.EmployeeServiceIpml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet" , urlPatterns = {"/employee"})
public class EmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeServiceIpml();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if(actionUser == null){
            actionUser = "";
        }switch (actionUser){
            case "create":
                createEmployee(request, response);
                break;
            case "update":
                updateEmployee(request, response);
                break;
            case "search":
                searchEmployee(request, response);
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
            case "showFormEmployee":
                showFormCreateEmployee(request, response);
                break;
            case "formUpdateById":
                updateEmployeeById(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
            default:
                listEmployee(request, response);
                break;
        }
    }

    public void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        EmployeeService employeeService = new EmployeeServiceIpml();
        List<Employee> employeeList = employeeService.displayEmployeeList();
        request.setAttribute("eList", employeeList);
        request.getRequestDispatcher("employeeHome.jsp").forward(request, response);
    }

    public void createEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        EmployeeService employeeService = new EmployeeServiceIpml();
        Employee employee = new Employee();
        employee.setEmployeeName(request.getParameter("employeeName"));
        employee.setEmployeeDateOfBirth(request.getParameter("employeeDateOfBirth"));
        employee.setEmployeeIdCard(request.getParameter("employeeIdCard"));
        employee.setEmployeeSalary(Double.parseDouble(request.getParameter("employeeSalary")));
        employee.setEmployeePhoneNumber(request.getParameter("employeePhoneNumber"));
        employee.setEmployeeEmail(request.getParameter("employeeEmail"));
        employee.setEmployeeAddress(request.getParameter("employeeAddress"));
        Position position = new Position();
        position.setPositionId(Integer.parseInt(request.getParameter("p")));
        employee.setPosition(position);
        EducationDegree educationDegree = new EducationDegree();
        educationDegree.setEducationDegreeId(Integer.parseInt(request.getParameter("e")));
        employee.setEducationDegree(educationDegree);
        Division division = new Division();
        division.setDivisionId(Integer.parseInt(request.getParameter("d")));
        employee.setDivision(division);
        employeeService.addEmployee(employee);
        response.sendRedirect("/employee");
    }

    public void showFormCreateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        EmployeeService employeeService = new EmployeeServiceIpml();
        List<Position> positionList = employeeService.getAllPosition();
        request.setAttribute("position", positionList);

        List<EducationDegree> educationDegreeList = employeeService.getAllEducationDegree();
        request.setAttribute("education", educationDegreeList);

        List<Division> divisionList = employeeService.getAllDivision();
        request.setAttribute("division", divisionList);

        request.getRequestDispatcher("createEmployee.jsp").forward(request, response);
    }

    public void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        EmployeeService employeeService = new EmployeeServiceIpml();
        String employeeId = request.getParameter("did");
        employeeService.removeEmployee(employeeId);
        response.sendRedirect("/employee");
    }

    public void updateEmployeeById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String employeeId = request.getParameter("eid");
        EmployeeService employeeService = new EmployeeServiceIpml();

        Employee employee = employeeService.updateEmployeeById(employeeId);
        request.setAttribute("tony", employee);

        List<Position> positionList = employeeService.getAllPosition();
        request.setAttribute("position", positionList);


        List<EducationDegree> educationDegreeList = employeeService.getAllEducationDegree();
        request.setAttribute("education", educationDegreeList);

        List<Division> divisionList = employeeService.getAllDivision();
        request.setAttribute("division", divisionList);

        request.getRequestDispatcher("updateEmployee.jsp").forward(request, response);
    }

    public void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        EmployeeService employeeService = new EmployeeServiceIpml();
        Employee employee = new Employee();
        employee.setEmployeeId(Integer.parseInt(request.getParameter("employeeId")));
        employee.setEmployeeName(request.getParameter("employeeName"));
        employee.setEmployeeDateOfBirth(request.getParameter("employeeDateOfBirth"));
        employee.setEmployeeIdCard(request.getParameter("employeeIdCard"));
        employee.setEmployeeSalary(Double.parseDouble(request.getParameter("employeeSalary")));
        employee.setEmployeePhoneNumber(request.getParameter("employeePhoneNumber"));
        employee.setEmployeeEmail(request.getParameter("employeeEmail"));
        employee.setEmployeeAddress(request.getParameter("employeeAddress"));
        Position position = new Position();
        position.setPositionId(Integer.parseInt(request.getParameter("position")));
        employee.setPosition(position);
        EducationDegree educationDegree = new EducationDegree();
        educationDegree.setEducationDegreeId(Integer.parseInt(request.getParameter("education")));
        employee.setEducationDegree(educationDegree);
        Division division = new Division();
        division.setDivisionId(Integer.parseInt(request.getParameter("division")));
        employee.setDivision(division);
        employeeService.updateEmployee(employee);
        response.sendRedirect("/employee");
    }

    public void searchEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String employeeName = request.getParameter("search");
        String employeeAddress = request.getParameter("search");
        EmployeeService employeeService = new EmployeeServiceIpml();
        List<Employee> employeeList = employeeService.findByName(employeeName, employeeAddress);
        request.setAttribute("eList", employeeList);
        request.getRequestDispatcher("employeeHome.jsp").forward(request, response);

    }

}
