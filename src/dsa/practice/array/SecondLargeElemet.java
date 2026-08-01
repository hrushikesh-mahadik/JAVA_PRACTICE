package dsa.practice.array;

import java.util.Scanner;

public class SecondLargeElemet {
	public static void main(String[] args) {
	

		        Scanner sc = new Scanner(System.in);

		        System.out.print("ENTER THE SIZE OF ARRAY: ");
		        int size = sc.nextInt();

		        int arr[] = new int[size];

		        System.out.println("ENTER ELEMENTS:");

		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = sc.nextInt();
		        }

		        int max = Integer.MIN_VALUE;
		        int secondMax = Integer.MIN_VALUE;

		       
				for (int i = 1; i < arr.length; i++) {
		            if (arr[i] > max) {
		            	secondMax = max;
		                max = arr[i];
		            }else if (arr[i]>secondMax) {
		            	secondMax = arr[i];
		            }
		        }

		        System.out.println("ARRAY MAX ELEMENT IS : " + max);
		        System.out.println("ARRAY SECOND MAX ELEMENT IS   : " + secondMax);

		        sc.close();
		    }
		
	}


