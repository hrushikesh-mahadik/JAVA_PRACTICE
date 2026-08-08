package com.oops.Interfaces;

public class B {
	public static void main(String[] args) {
		Shape s = new Rectangle(5,4);
		double i = s.calculateArea();
		
		System.out.println(i);
		
		Shape s1 = new Circle(5);
		double j = s1.calculateArea();
		
		System.out.println(j);
		
	}

}
