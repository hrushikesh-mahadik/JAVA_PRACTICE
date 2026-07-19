package java_basic;

import java.util.*;

public class LeafYear {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Year:");
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println("It even");
		}else {
			System.out.println("It odd");
			
		}
		
	}
}
