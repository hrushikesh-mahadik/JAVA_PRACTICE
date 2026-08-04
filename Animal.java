package com.oops.polymorphism;
//run time
public class Animal {

 	public void Sound() {
		System.out.println("...");
	}
	
	// compile time
//	public void sayhello(String s) {
//		System.out.println("Break");
//	}
//	public void sayhello(int a) {
//		System.out.println("meow");
//	}


public static void main(String[] args) {
	Animal a = new Bird();
	a.Sound();
	
	
	
}	
}
