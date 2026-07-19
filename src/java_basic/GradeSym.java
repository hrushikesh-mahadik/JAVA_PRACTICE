package java_basic;
import java.util.*;
public class GradeSym {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student marks outof 100");
		int marks = sc.nextInt();
		
		if(marks>90) {
			System.out.println("Student get A+");
		}else if(marks>80) {
			System.out.println("Student get A");
		}else if(marks>70) {
			System.out.println("Student get B");
		}else if(marks>60) {
			System.out.println("Student get C");
		}else if(marks>50) {
			System.out.println("Student get D");
		}else {
			System.out.println("Student get improve");
		}
		
	}

}
