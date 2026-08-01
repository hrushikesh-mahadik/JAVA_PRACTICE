package dsa.practice.array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF ARRAY: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

       
        System.out.println("ENTER ELEMENTS:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();     
	    }
    	System.out.println("ARRAY:- ");
        for(int i=0;i<arr.length;i++) {
        
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.println("REVERSE ARRAY:- ");
        for(int i = arr.length-1; i>=0; i--) {
      
        System.out.print( arr[i]+" ");
        }
      
     
		
	}
}
