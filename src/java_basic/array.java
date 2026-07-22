package java_basic;

import java.util.Scanner;
import java.util.*;

public class array {

	public static void main(String[] args) {
		int y[] = new int[5];
		array e1=new array();
		e1.acceptvalue(y);
		e1.showValue(y);
		
		
		
		
	}
	
	public void acceptvalue(int y[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		for(int k = 0; k<y.length;k++) {
			y[k]=sc.nextInt();
			
		}
	}
	
	public void showValue(int h[]) {
		System.out.println("the value is ");
		for(int k =0;k<h.length;k++) {
			System.out.print(h[k]+ " ");
		}
	}
}
