package com.StudentManagementSystem;

public class Student {
    private String name;
    private int usn;
    private int marks;

  public  Student(String name, int usn, int marks){
        this.name = name;
        this.usn = usn;
        this.marks = marks;

    }

    public void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("University Seat Number: " + usn);
        System.out.println("Marks: "+ marks);
    }

    public String getName(){
        return name;
    }
    public int getUsn(){
      return usn;
    }
    public int getMarks(){
      return marks;
    }

    public void setName(String name){
      this.name = name;
    }

    public void setUsn(int usn){
        this.usn = usn;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
}
