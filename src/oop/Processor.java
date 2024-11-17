package oop;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1.Enter information of n student ");
            System.out.println("2.Display student information  ");
            System.out.println("3.Find student by ID ");
            System.out.println("4.Delete student by ID ");
            System.out.println("5.Edit student by ID");
            System.out.println("0.Exit");
            System.out.print("Your choice : ");
            choice = sc.nextInt();
            sc.nextLine();//Xoa ky tu xuong dong

            switch (choice) {
                case 1:
                    System.out.print("Enter number of students: ");
                    int n = sc.nextInt();
                    sc.nextLine(); // Xoa ky tu xuong dong
                    studentList.addStudents(n);
                    break;
                case 2:
                    studentList.displayAllStudents();//Hien thi tat ca sinh vien
                    break;
                case 3:
                    System.out.print("Enter student ID to find: ");
                    String idToFind = sc.nextLine();
                    Student foundStudent = studentList.findStudentById(idToFind);//Tim sinh vien bang ID
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfo();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");//Xoa sinh vien bang ID
                    String idToDelete = sc.nextLine();
                    if (studentList.deleteStudentById(idToDelete)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter student ID to edit: ");//Chinh sua thong tin sinh vien bang ID
                    String idToEdit = sc.nextLine();
                    if (studentList.editStudentById(idToEdit)) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exit..");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
