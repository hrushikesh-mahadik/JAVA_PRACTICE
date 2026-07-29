package com.oops.inheritance;

import java.util.Scanner;

public class Persons {

    private String name;
    private int age;

    public Persons() {

    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void acceptDataPerson() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }

    public void showDataPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}