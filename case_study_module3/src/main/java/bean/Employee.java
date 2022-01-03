package bean;

import java.util.Date;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeDateOfBirth;
    private String employeeIdCard;
    private double employeeSalary;
    private String employeePhoneNumber;
    private String employeeEmail;
    private String employeeAddress;
    private Position position;
    private Division division;
    private EducationDegree educationDegree;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeDateOfBirth, String employeeIdCard,
                    double employeeSalary, String employeePhoneNumber, String employeeEmail,
                    String employeeAddress, Position position, Division division, EducationDegree educationDegree) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDateOfBirth = employeeDateOfBirth;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.division = division;
        this.educationDegree = educationDegree;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDateOfBirth() {
        return employeeDateOfBirth;
    }

    public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
        this.employeeDateOfBirth = employeeDateOfBirth;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDateOfBirth='" + employeeDateOfBirth + '\'' +
                ", employeeIdCard='" + employeeIdCard + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeePhoneNumber='" + employeePhoneNumber + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", position=" + position +
                ", division=" + division +
                ", educationDegree=" + educationDegree +
                '}';
    }
}
