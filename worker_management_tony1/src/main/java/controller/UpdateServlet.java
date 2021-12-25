package connect_woker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet", urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String eId = request.getParameter("id");
        String eName = request.getParameter("name");
        String eSalary = request.getParameter("salary");
        String ePhoneNumber = request.getParameter("phoneNumber");
        String eEmail = request.getParameter("email");
        String eAddress = request.getParameter("address");
        DBConnect dbConnect = new DBConnect();
        dbConnect.updateEmployee(eId,eName, eSalary, ePhoneNumber,eEmail, eAddress);
        response.sendRedirect("employee");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBConnect dbConnect = new DBConnect();
        String id = request.getParameter("eid");
        Employee e = dbConnect.getEmployeeId(id);
        request.setAttribute("ep", e);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }
}
