package dsa.practice.loop;

import java.util.Scanner;

public class Armstrong {
       public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    System.out.println("IS ARMSTRONG "+isArmstrong(n));
       } 
       
	    static boolean isArmstrong(int n) {
	    int digit = 0, temp;
	    temp = n;
	    int sum =0;
	    while(temp>0) {
	    	temp = temp/10;
	    	digit++;
	    }
	    temp = n;
	    while(temp>0) {
	    	int last = temp%10;
	    	sum +=Math.pow(last, digit);
	    	temp = temp/10;
	    }
	    if(sum == n)
	    	return true;
	    
	    return false;
	    }
       

}
