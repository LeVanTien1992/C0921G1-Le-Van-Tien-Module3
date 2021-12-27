package service;

import bean.Student;

import java.util.List;

public interface StudentService {
//    int id, String name, String gender, int age, String dob, String address, double grade
    List<Student> displayStudentList();
    void addStudent(String name, String gender, String age, String dob, String address, String grade);
    List<Student> findByName(String name);
    Student editStudentById(String id);
    void update(String id, String name, String gender, String age, String dob, String address, String grade);
    void remove(String id);
//    Student viewStudentList(String id);
}
