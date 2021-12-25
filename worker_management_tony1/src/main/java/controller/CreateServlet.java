package connect_woker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateServlet", urlPatterns = "/add")
public class CreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String eName = request.getParameter("name");
        String eSalary = request.getParameter("salary");
        String ePhoneNumber = request.getParameter("phoneNumber");
        String eEmail = request.getParameter("email");
        String eAddress = request.getParameter("address");

        DBConnect dbConnect = new DBConnect();
        dbConnect.addEmployee(eName, eSalary, ePhoneNumber,eEmail, eAddress);
        response.sendRedirect("employee");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
