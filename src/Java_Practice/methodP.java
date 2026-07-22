package Java_Practice;

import java.util.Scanner;

class a{
	public void series(int a, int b) {
		Scanner sc = new Scanner(System.in);
	int start=	a=sc.nextInt();
	int end= 	b=sc.nextInt();
	for(int i=start;i<=end;i++) {
		System.out.println("the now " + i);
	}
	
		
		
	
}}

public class methodP {
public static void main(String[] args) {
	a a=new a();
	a.series(0, 0);
}
}
