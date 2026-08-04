package com.array.practice;

import java.util.Scanner;
import java.util.*;

public class ReverseArray {
	public void setArray(int a[]) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Value:-");
		 for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		 }
	 }
	 
	 public void getArray(int a[]) {
		 System.out.print("Array Value:- ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
	 }
}
	 
}