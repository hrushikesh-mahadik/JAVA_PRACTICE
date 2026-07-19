package java_basic;
import java.util.*;
public class PosNeg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the No");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("the no is Postive");
		}
		else if(n<0) {
			System.out.println("the no is negative");
		}
		else {
			System.out.println("insert vaild no");
		}
	}

}
