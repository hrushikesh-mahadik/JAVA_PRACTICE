package com.oops.Interfaces;

abstract class Animal {
	 abstract void sound();
}

class lion extends Animal {
	@Override
	void sound() {
		System.out.println("Roar");
	}
}

class cat extends Animal{
	void sound() {
		System.out.println("meow");
	}


}
