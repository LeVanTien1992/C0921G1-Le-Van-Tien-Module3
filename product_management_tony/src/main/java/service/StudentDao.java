package service;

import models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<Student> getAllStudent(){
        List<Student> list = new ArrayList<>();
        String query = "SELECT * FROM student_management.student";

        try {
            conn = new DBConnect().getDBConect();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
//                int id, String name, String gender, int age, String dob, String address, String grade
                list.add(new Student(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getNString(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
        }catch (Exception e){
            e.getMessage();
        }
        return list;
    }

    public void deleteStudent(String id){
        String query = "delete from student \n" +
                "where id_class = ?;";

        try {
            conn = new DBConnect().getDBConect();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeLargeUpdate();
        }catch (Exception e){
            e.getMessage();
        }
    }
    public void createStudent(String name, String gender, String age, String dob, String address, String grade){
//        int id, String name, String gender, int age, String dob, String address, String grade
        String query = "insert into student (`name`, gender, age, dob, address, grade)\n" +
                "values\n" +
                "(?, ?, ?,?, ?, ?);";
        try {
            conn = new DBConnect().getDBConect();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, age);
            ps.setString(4, dob);
            ps.setString(5, address);
            ps.setString(6, grade);
            ps.executeLargeUpdate();
        }catch (Exception e){
            e.getMessage();
        }
    }
}
