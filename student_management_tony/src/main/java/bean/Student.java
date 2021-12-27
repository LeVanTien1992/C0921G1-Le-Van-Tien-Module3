package bean;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String dob;
    private String address;
    private double grade;

    public Student() {
    }

    public Student(int id, String name, String gender, int age, String dob, String address, double grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
