package com.oops.polymorphism;

public class MethodOverloading {

	public void hello() {
		System.out.println("HELLO");
	}
	public void hello(int a) {
		System.out.println("Hello everyone");
	}
	public void hello(String s) {
		System.out.println("Hello World");
	}
	
	public void Int(int a,int b) {
		System.out.println("NO-->"+a+","+b);
	}
	public void Int(int b) {
		System.out.println("NO-->"+b);
	}
	public void Int(int ... n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		 MethodOverloading a = new MethodOverloading();
//		 a.hello();
//		 a.hello(5);
//		 a.hello("ram");
		 
		 a.Int(5, 6);
		 a.Int(5);
	}
}
