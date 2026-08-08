package com.oops.Interfaces;

public class Rectangle extends Shape{
	double l,b;
	public Rectangle(double l, double b) {
		this.l=l;
		this.b=b;
	}
	
	double calculateArea() {
		return l*b;
	}
}