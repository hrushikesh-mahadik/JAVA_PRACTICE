package Java_Practice;

import java.util.Scanner;
import java.util.*;

class series{
	
	
	public void seriesFibo() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("total fibo no " +n);
	int first =0, secondN=1;

	for(int i =1; i<=n ; i++) {
		System.out.println(first);
		int next = first+secondN;
		first = secondN;
		secondN = next;
	}
}
	
	
	public void CountNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range series");
		int n = sc.nextInt();
		
		int count = 0;
		for (int i = 1; i<=n; i++) {
			System.out.println(i);
			count++;
			
		}
		System.out.println("total no: " +count);
	}
}

public class seriesMethod {
public static void main(String[] args) {
	System.out.println();
	series obj = new series();
	obj.seriesFibo();
	obj.CountNum();
}
}
