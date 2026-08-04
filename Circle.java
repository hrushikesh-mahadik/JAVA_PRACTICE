package com.oops.polymorphism;

public class Circle extends Shape {
    double a;

    public Circle(int r) {
        double area = 3.14 * r * r;  // local variable, calculated first
        this.a = area;               // then assigned to the field
    }

    @Override
    public void calculateshape() {
        System.out.println("THE CIRCLE AREA IS " + a);
    }
}