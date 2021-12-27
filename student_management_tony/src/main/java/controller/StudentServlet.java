package controller;

import bean.Student;
import service.StudentService;
import service.StudentServiceIpml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = {"/student", "/"})
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }switch (action){
            case "create":
                createStudent(request, response);
                break;
            case "edit":
                updateStudent(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }switch (action){
            case "edit":
                getStudentById(request, response);
                break;
            case "delete":
                deleteStudent(request, response);
                break;
            case "view":
                viewStudent(request, response);
                break;
            case "search":
                searchStudentByName(request, response);
                break;
            default:
                listStudent(request, response);
                break;
        }
    }

    public void listStudent(HttpServletRequest request, HttpServletResponse response){
        StudentService studentService = new StudentServiceIpml();
        List<Student> studentList = studentService.displayStudentList();
        request.setAttribute("listS", studentList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // get sid from jsp
                String id = request.getParameter("sid");
                // pass sid to servlet
                StudentService studentService = new StudentServiceIpml();
                studentService.remove(id);
                response.sendRedirect("student");
    }

    private void createStudent(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
        //    int id, String name, String gender, int age, String dob, String address, double grade
        String sName = request.getParameter("name");
        String sGender = request.getParameter("gender");
        String sAge = request.getParameter("age");
        String sDob = request.getParameter("dob");
        String sAddress = request.getParameter("address");
        String sGrade = request.getParameter("grade");

        StudentService studentService = new StudentServiceIpml();
        studentService.addStudent(sName, sGender, sAge, sDob, sAddress , sGrade);
        response.sendRedirect("student");
    }

    public void getStudentById(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
        String id = request.getParameter("uid");
        StudentService studentService = new StudentServiceIpml();
        Student s = studentService.editStudentById(id);
        request.setAttribute("st", s);
        try {
            request.getRequestDispatcher("update.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
        String sId = request.getParameter("id");
        String sName = request.getParameter("name");
        String sGender = request.getParameter("gender");
        String sAge = request.getParameter("age");
        String sDob = request.getParameter("dob");
        String sAddress = request.getParameter("address");
        String sGrade = request.getParameter("grade");

        StudentService studentService = new StudentServiceIpml();
        studentService.update(sId, sName, sGender, sAge, sDob, sAddress, sGrade);
        response.sendRedirect("student");
    }

    public void viewStudent(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
        StudentService studentService = new StudentServiceIpml();
        String sId = request.getParameter("id");

        Student student  = studentService.editStudentById(sId);
        request.setAttribute("list", student);
        try {
            request.getRequestDispatcher("view.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }


    public void searchStudentByName(HttpServletRequest request, HttpServletResponse response) throws  SecurityException, IOException{
        String name = request.getParameter("search");
        StudentService studentService = new StudentServiceIpml();
        List<Student> studentList = studentService.findByName(name);
        request.setAttribute("listS", studentList);
        try {
            request.getRequestDispatcher("list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

}
