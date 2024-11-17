package oop;

import java.util.ArrayList;

public class StudentList {

    private ArrayList<Student> studentList = new ArrayList<>(); //Danh sach sinh vien

    public void displayAllStudents() {//Hien thi tat ca sinh vien
        if (studentList.isEmpty()) {
            System.out.println("No student in the list .");//Khong co sinh vien nao trong danh sach
        } else {
            for (Student student : studentList) {
                student.displayStudentInfo();//Hien thi tat ca sinh vien
                System.out.println("----------------------------");
            }
        }
    }

    public Student findStudentById(String idToFind) {//Tim sinh vien theo ID
        for (Student student : studentList) {
            if (student.getStudentId().equals(idToFind)) {
                return student;
            } else {
            }
        }
        return null;
    }

    public boolean deleteStudentById(String idToDelete) {//Xoa sinh vien theo ma
        Student student = findStudentById(idToDelete);
        if (student != null) {
            studentList.remove(student);
            return true;
        }
        return false;
    }

    public boolean editStudentById(String idToEdit) {//Edit sinh vien theo ma
        Student student = findStudentById(idToEdit);
        if (student != null) {
            System.out.println("Edit information  for student have a ID : " + idToEdit);
            student.enterStudentInfo();
            return true;
        }
        return false;
    }

    public void addStudents(int n) {//Nhap thong tin cho n sinh vien
        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            Student student = new Student();
            student.enterStudentInfo();
            studentList.add(student);
        }
    }

}
