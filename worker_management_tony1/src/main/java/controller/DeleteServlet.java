package connect_woker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet", urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // b1: get eid from jsp
        String id = request.getParameter("eid");
        // b2: pass eid to DBConnect
        DBConnect dbConnect = new DBConnect();
        dbConnect.deleteEmployee(id);
        response.sendRedirect("employee");
    }
}
