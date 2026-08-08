package com.oops.Interfaces;

public class Circle extends Shape{
double radius;
Circle(double r){
	this.radius=r;
}

double calculateArea() {
	return 3.14*radius*radius;
}
}


