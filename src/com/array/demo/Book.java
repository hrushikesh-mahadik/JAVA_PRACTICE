package com.array.demo;
import java.util.*;


class Book {
	private int price;
	private String author;
	private String name;
	
	public void Book(){
		this.price =price;
		this.author=author;
		this.name=name;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Price");
		price = sc.nextInt();
		
		System.out.println("Enter Auther name");
		author = sc.next();
		
		System.out.println("enter the name of book");
		name = sc.next();
		
	}
	
	public void display() {
		System.out.println("Price : " +price);
		System.out.println("author : " +author);
		System.out.println("book : " +name);
	}
	
}
