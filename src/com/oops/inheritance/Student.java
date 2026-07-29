package com.oops.inheritance;

import java.util.Scanner;

public class Student extends Persons {

    private int id;
    private String course;

    public Student() {
    	acceptDataStudent()
; 
    showDataStudent();	
    }

    public Student(int id, String course) {
       
    setId(id);
        setCourse(course);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void acceptDataStudent() {

        acceptDataPerson();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter ID: ");
        id = sc.nextInt();
    }

    public void showDataStudent() {

        System.out.println("Student Details");
        showDataPerson();
        System.out.println("Course : " + course);
        System.out.println("ID     : " + id);
    }
}