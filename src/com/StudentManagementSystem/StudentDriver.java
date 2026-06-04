package com.StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDriver {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        Student s1 = new Student("Doraemon", 101,96 );
        Student s2 = new Student("Bheem", 102, 90);



        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);




        scanner.close();
    }
}
