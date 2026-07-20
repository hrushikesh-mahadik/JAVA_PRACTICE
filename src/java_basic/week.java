package java_basic;
import java.util.*;
public class week {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of the : ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("tuesday");
		
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			default:
				System.out.println("enter the right choice");
		}
	}

}
