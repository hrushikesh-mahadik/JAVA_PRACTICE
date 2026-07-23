package com.array.demo;

import java.util.Scanner;

public class Stud {

	private int id;
	private int age;
	private String name;
	private String gender;
	private String dept;
	
	public static Stud student_list[] = new Stud[5];
	
	public Stud() {}
	public Stud(int a,int b,String n,String g,String d) {
		setId(a);
		setAge(b);
		setName(n);
		setGen(g);
		setDept(d);
	}
	
	
	
	public void showStudentdata() {
		System.out.println("Id-: "+getId());
		System.out.println("Age-: "+getAge());
		System.out.println("Name -: "+getName());
		System.out.println("Gender -: "+getGen());
		System.out.println("Department -: "+getDept());
	}
	
	public void acceptStudentData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		setId(sc.nextInt());
		System.out.println("enter Age");
		setAge(sc.nextInt());
		System.out.println("enter name");
		setName(sc.next());
		System.out.println("enter gender");
		setGen(sc.next());
		System.out.println("enter department");
		setDept(sc.next());
	}
	
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getGen() {
		return gender;
	}
	public String getDept() {
		return dept;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGen(String gender) {
		this.gender = gender;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public static void acceptStudentArray() {
		for(int k=0;k<student_list.length;k++) {
			student_list[k]=new Stud();
			student_list[k].acceptStudentData();
		}
	}
	
	public static void showStudentArray() {
		for(Stud stud:student_list) {
			stud.showStudentdata();
		}
	}
	
}
