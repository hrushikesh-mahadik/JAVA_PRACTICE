package com.oops.polymorphism;

public class Vehicle {
	public void speedup() {
		System.out.println("-----");
	}
	
	public static void main(String[] args) {
		Vehicle v = new Bicycle();
		v.speedup();
		Vehicle a = new Car();
		a.speedup();
		}
}
