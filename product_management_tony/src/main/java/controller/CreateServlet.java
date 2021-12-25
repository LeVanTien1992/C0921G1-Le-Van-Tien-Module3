package controller;

import service.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateServlet", urlPatterns = "/create")
public class CreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //        int id, String name, String gender, int age, String dob, String address, String grade
        String sname = request.getParameter("name");
        String sgender = request.getParameter("gender");
        String sage = request.getParameter("age");
        String sdob = request.getParameter("dob");
        String saddress = request.getParameter("address");
        String sgrade = request.getParameter("grade");

        StudentDao dao = new StudentDao();
        dao.createStudent(sname, sgender, sage, sdob, saddress, sgrade);
        response.sendRedirect("student");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
