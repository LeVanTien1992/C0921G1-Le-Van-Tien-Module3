import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet" , urlPatterns = "/account")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String s = request.getParameter("username");
                String a = request.getParameter("password");
                if (s.equals("admin") && a.equals("1234")){
                    Dao dao = new Dao();
                    List<Customer> customerList = dao.getAll();
                    request.setAttribute("customer", customerList);
                    request.getRequestDispatcher("display.jsp").forward(request, response);
                }
                 else {
                     String err = "Mật khẩu không đúng";
                     request.setAttribute("customer", err);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
