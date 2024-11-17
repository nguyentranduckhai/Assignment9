package oop;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Student {

    String ID;
    String fullname;
    Date dateOfBirth;
    String major;
    float gpa;

    public Student(String i, String fn, Date d, String m, float g) {
        ID = i;
        fullname = fn;
        dateOfBirth = d;
        major = m;
        gpa = g;
    }

    public Student() {
    }

    // Getter and Setter methods
    public String getStudentId() {
        return ID;
    }

    public void setStudentId(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    void displayStudentInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dobFormatted = dateFormat.format(dateOfBirth);//Chuyen ngay sinh ve dang chuoi
        System.out.println("ID : " + ID + ", FullName : " + fullname + "Date Of Birth : " + dateOfBirth + "Major : " + major + "GPA : " + gpa);
    }

    void enterStudentInfo() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Student ID : ");
            ID = sc.nextLine();
            System.out.println("Enter Full name of Student  : ");
            fullname = sc.nextLine();
            System.out.println("Enter Date Of Birth Of Student (dd//MM//yyyy) : ");
            String dob = sc.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateOfBirth = dateFormat.parse(dob);
            System.out.println("Enter major of Student  : ");
            major = sc.nextLine();
            System.out.println("Enter Student GPA : ");
            gpa = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Error Please try again.");
        }
    }

}
