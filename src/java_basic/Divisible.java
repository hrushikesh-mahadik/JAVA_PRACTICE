package java_basic;
import java.util.*;
public class Divisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the No: ");
		int n = sc.nextInt();
		
		if (n%7==0) {
			System.out.println("The no is divisible by 7");
		}
		else {
			System.out.println("The no is Not divisible by 7");
		}
	}

}
