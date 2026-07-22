package Java_Practice;

import java.util.Scanner;
import java.util.*;

class arrayVal{
	
	
	
	public void setArray(int a[]) {
        Scanner s = new Scanner(System.in);
       
        System.out.println("Enter value:");
        
        for (int i = 0; i < a.length; i++) {
        	
            a[i] = s.nextInt();
        }
    }
	
	
	public void getArray(int a[]) {
        System.out.println("Array value:");

        for (int i = 0; i < a.length; i++) {
       
            System.out.println(a[i]);
     
        }
    }
//	public void evenshow(int a[]) {
//		System.out.println("value from array");
//		int k =0;
//		while(k<a.length);
//		{
//			if(a[k]%2!=0) {
//				int sq = a[k]*a[k];
//			System.out.println(sq);
//		}
//			k++;
//			}
//		}
	
	
//	public void cube(int a[]) {
//			System.out.println("value odd from array");
//			int k =0;
//			for(k = 0;k<a.length;k++);
//			{
//				int sq=a[k]*a[k];
//				System.out.println(sq);
//		}
//			}
//		
//	}
	
//	public void print(int a[]) {
//		int k=a.length-1;
//		while(k>=0) {
//			System.out.print(a[k]);
//			k--;
//		}
//	}
	public void sum(int a[]) {
		int sum = 0;
		 for (int i = 0; i < a.length; i++) {
		       sum +=a[i];
		       
		       System.out.println("sum is ");
		       System.out.println(sum);
	     
	        }
	}
	
}


public class arrayP {
public static void main(String[] args) {
 
	arrayVal aa = new arrayVal();
	int a[] = new int[5];
	
	aa.setArray(a);
	aa.getArray(a);
	aa.sum(a);
	
	
	
	

	}
	
	
	
}

