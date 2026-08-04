package com.oops.polymorphism;

public class Shape {
    public void calculateshape() {
        System.out.println("AREA IS");
    }

    public static void main(String[] args) {
        Shape s = new Circle(5);
        s.calculateshape();
        
        Shape a = new Rectangle(3,5);
        a.calculateshape();
    }
    
    
}