package controller;

import models.Student;
import service.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet" ,urlPatterns = "/student")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentDao dao = new StudentDao();
        List<Student> list =  dao.getAllStudent();

        // get data from dao
        request.setAttribute("listS", list);
        // set data to jsp
        request.getRequestDispatcher("show.jsp").forward(request, response);
    }
}
