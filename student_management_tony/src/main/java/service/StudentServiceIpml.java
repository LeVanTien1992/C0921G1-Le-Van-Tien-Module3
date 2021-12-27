package service;

import context.DBContect;
import bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceIpml implements StudentService{
    List<Student> studentList = new ArrayList<>();
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    List<Student> getAllStudent(){
        String query ="SELECT * FROM student_management.student";
        try {
            conn = new DBContect().DBConnect();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                studentList.add(new Student(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getDouble(7)));
            }
        }catch (Exception e){
            e.getMessage();
        }

        return studentList;
    }
    @Override
    public List<Student> displayStudentList() {
        return new ArrayList<>(getAllStudent());
    }

    @Override
    public void addStudent(String name, String gender, String age, String dob, String address, String grade) {
        String query = "insert into student (`name`, gender, age, dob, address, grade)\n" +
                "values\n" +
                "(?, ?, ?, ?, ?, ?)";
        try {
            conn = new DBContect().DBConnect();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, age);
            ps.setString(4, dob);
            ps.setString(5, address);
            ps.setString(6, grade);
            ps.executeUpdate();
        }catch (Exception e){
            e.getMessage();
        }
    }

    @Override
    public List<Student> findByName(String name) {
        List<Student> studentList = new ArrayList<>();
        String query = "select * \n" +
                "from student\n" +
                "where `name` like ?;";
        try {
            conn = new DBContect().DBConnect();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%"+name+"%");
            rs = ps.executeQuery();
            while (rs.next()){
                studentList.add( new Student(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getDouble(7)));
            }
        }catch (Exception e){
            e.getMessage();
        }
        return studentList;
    }

    @Override
    public Student editStudentById(String id) {

        String query = "select * from student \n" +
                "where id_class = ?";

        try {
            conn = new DBContect().DBConnect();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()){
                return new Student(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getDouble(7));
            }
        }catch (Exception e){
            e.getMessage();
        }
        return null;
    }

    @Override
    public void update(String id, String name, String gender, String age, String dob, String address, String grade) {
        String query = "update student\n" +
                "set `name`= ?,\n" +
                " gender = ?,\n" +
                " age = ?,\n" +
                " dob = ?,\n" +
                " address= ?,\n" +
                " grade = ?\n" +
                " where id_class =?;";

        try {
            conn = new DBContect().DBConnect();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, age);
            ps.setString(4, dob);
            ps.setString(5, address);
            ps.setString(6, grade);
            ps.setString(7, id);
            ps.executeUpdate();
        }catch (Exception e){
            e.getMessage();
        }
    }

    @Override
    public void remove(String id) {
        String query = "delete from student \n" +
                "where id_class = ?;";
        try {
            conn = new DBContect().DBConnect();
            ps = conn.prepareStatement(query);
            ps.setString(1,id);
            ps.executeUpdate();
        }catch (Exception e){
            e.getMessage();
        }
    }

//    @Override
//    public Student viewStudentList(String id) {
//        Student student = new Student();
//        String query ="select * from student \n" +
//                "where id_class = ?;";
//        try {
//            conn = new DBContect().DBConnect();
//            ps = conn.prepareStatement(query);
//            ps.setString(1, id);
//            rs = ps.executeQuery();
//            while (rs.next()){
//                return new Student(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getInt(4),
//                        rs.getString(5),
//                        rs.getString(6),
//                        rs.getDouble(7));
//            }
//        }catch (Exception e){
//            e.getMessage();
//        }
//
//        return null;
//    }

//    public static void main(String[] args) {
//        StudentService dao = new StudentServiceIpml();
//        Student s = dao.studentList("24");
//        System.out.println(s);
//    }
}
