package test_student;

import models.Student;
import service.StudentDao;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        List<Student> list =  dao.getAllStudent();
        for (Student s : list){
            System.out.println(s);
        }
    }
}
