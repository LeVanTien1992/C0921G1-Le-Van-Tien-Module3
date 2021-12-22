import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletBacMot", urlPatterns = "/ptbacmot")
public class ServletBacMot extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));

//        if (num1 == 0) {
//            if (num2 == 0) {
//                System.out.println("Phương trình này có vô số nghiệm.");
//            } else {
//                System.out.println("Phương trình vô nghiệm.");
//            }
//        } else {
//            double nghiem =  (-num2 / num1);   // ép kiểu để cho ra kết quả chính xác
//            System.out.println("Phương trình có nghiệm x = " + nghiem + ".");
//        }
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        try {
            if (num1 == 0) {
                if (num2 == 0) {
                    writer.println("<h1>Phuong trinh vo so nghiem.</h1>");
                } else {
                    writer.println("<h1>Phuong trinh vo nghiem.</h1>");
                }
            } else {
                double nghiem =  (-num2 / num1);
                writer.println("<h1>Phuong trinh co nghiem x = " + nghiem + "</h1>");
            }
        }catch (NumberFormatException n){
            writer.println("Not Found");
        }
        writer.println("</html>");
    }
}
