package java_basic;
import java.util.*;


public class EleBill {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your unit: 40");
	int units = sc.nextInt();
	double chargs = 0,totalamt;
	if (units<50) {
		chargs =50+(units*1.2);
	}
	else if (units<=100) {
		chargs = 90+(units*1.2 );
	}
	else if (units<=150) {
		chargs = 120+(units*1.2);
		
	}else {
		System.out.println("your electricity use is higher then Standard unit");
	}
	
	totalamt = units+chargs;
   System.out.println("Your bill Toatal amount is(includeing charges)" +totalamt );

	}
	
}
