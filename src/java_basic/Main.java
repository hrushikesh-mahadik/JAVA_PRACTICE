package java_basic;

import java.util.Scanner;

 

public class Main {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
	
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("enter your no "); int
		 * a = sc.nextInt(); int b = sc.nextInt(); System.out.println(a+b); sc.close();
		 */
		
	
		/*
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); if(n>5) {
		 * System.out.println("this good number"); }else {
		 * System.out.println("no good"); }
		 		sc.close();*/
		
		int a = 4;
		int b = 5;
	
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a :" +a);
	
	System.out.println("b :" +b);
}
}
