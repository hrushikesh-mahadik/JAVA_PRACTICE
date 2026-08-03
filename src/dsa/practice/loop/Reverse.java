package dsa.practice.loop;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number: ");
		int n=sc.nextInt();
	
	int reveseNumber = 0, temp = n;
	
	while(temp>0) {
		int remainder = temp%10;
		reveseNumber = reveseNumber*10+remainder;
		temp=temp/10;
	}
	System.out.println(reveseNumber);
  }
}