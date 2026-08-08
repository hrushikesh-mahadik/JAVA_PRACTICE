package com.oops.Interfaces;

class m implements T1{
public void m() {
	
	System.out.println("hello");
}}


public class Main{
  	public static void main(String[] args) {
		T1 a = new m();
		System.out.println();
		a.m();
  	}
}
