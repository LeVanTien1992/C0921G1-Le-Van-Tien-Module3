import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletBacHai", urlPatterns = "/ptBacHai")
public class ServletBacHai extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double anum1 = Double.parseDouble(request.getParameter("anum1"));
        double bnum2 = Double.parseDouble(request.getParameter("bnum2"));
        double cnum3 = Double.parseDouble(request.getParameter("cnum3"));

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if(anum1==0) {
            if(bnum2==0) {
                if(cnum3==0) {
                    writer.println("<h1>Pt co vo so nghiem.</h1>");
                }else
                    writer.println("<h1>Pt vo nghiem.</h1>");
            }else
                writer.println("<h1>Pt co nghiem la ="+ -cnum3/bnum2+ "</h1>");
        }else{
            double delta= bnum2*bnum2 - 4*anum1*cnum3;

            if(delta==0) {
                writer.println("<h1>Pt co nghiem kep la =" + -bnum2/2*anum1 + "</h1>");
            }else if(delta>0) {
                writer.println("<h1>Pt co 2 nghiem phan biet la x1= "+
                        (-bnum2+Math.sqrt(delta)/(2*anum1)) + ", x2= "+(-bnum2-Math.sqrt(delta)/(2*anum1)) + "</h1>");
            }else
                writer.println("<h1>Pt vo nghiem.</h1>");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
