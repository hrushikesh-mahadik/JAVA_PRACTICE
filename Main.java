package com.oops.polymorphism;

public class Main {

	private int a;
	
	
	public static void main(String[] args) {
		Animal a = new Animal();
		//a.sayhello();
		Animal dog = new Dog();
		dog.Sound();
		Animal cat = new Cat();
		cat.Sound();
		
//		a.sayhello(5);
//		a.sayhello("dog");
		
		
		
	}


}
