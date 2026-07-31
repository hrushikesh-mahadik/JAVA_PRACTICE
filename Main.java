package com.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sayhello();
		Animal dog = new Dog();
		dog.sayhello();
		Animal cat = new Cat();
		cat.sayhello();
	}
}
