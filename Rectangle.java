package com.oops.polymorphism;

public class Rectangle extends Shape{
	
	double area;
	public Rectangle(int a,int b) {
		double c = a*b;
		this.area=c;
		
	}
	
  public void calculateshape() {
	  System.out.println("THE REACTANGLE AREA " + area);
  }
}
