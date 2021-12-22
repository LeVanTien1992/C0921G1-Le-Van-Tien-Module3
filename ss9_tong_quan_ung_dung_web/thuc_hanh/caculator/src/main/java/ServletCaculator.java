import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCaculator", urlPatterns = "/Caculator")
public class ServletCaculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int username = Integer.parseInt(request.getParameter("username"));
        int password = Integer.parseInt(request.getParameter("password"));
        String cong = request.getParameter("caculator");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        if(cong.equals("+")){
//            int kd = meo.cong(username, password);
            writer.println("<h1>"+(username + password) +"</h1>");
        }
        else if(cong.equals("-")){
//            int kd =meo.tru(username, password);
            writer.println("<h1>"+(username - password)+"</h1>");
        }
        else if(cong.equals("*")){
//            int kd =meo.nhan(username, password);
            writer.println("<h1>"+(username * password)+"</h1>");
        }
        else if(cong.equals("/")){
//            int kd =meo.chia(username, password);
            writer.println("<h1>"+(username / password)+"</h1>");
        }
        writer.println("</body>");
        writer.println("</html>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
