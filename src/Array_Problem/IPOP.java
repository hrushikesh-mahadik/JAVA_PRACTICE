package Array_Problem;

import java.util.Scanner;

class IPOP {
	 public void setArray(int a[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Value:-");
		 for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		 }
	 }
	 
	 public void getArray(int a[]) {
		 System.out.print("Array Value:- ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
	 }
		
	 }
		// CUBE OF ARRAY ELEMENT
		 public void cube(int a[]) {
			 System.out.println("Array cube Value: ");
			for(int i = 0; i<a.length; i++) {
				System.out.println (a[i]*a[i]*a[i] + " ");
			}
            }
		 
		 
		 // EVEN ELEMENT PRINT
		 public void even(int a[]) {
			 System.out.println("Even element: ");
			 int i = 0;
			 while(i<a.length) {
				 if(a[i]%2==0) {
					 System.out.print(a[i] + " ");
				
				 }	 i++;
			 }
		 }
		 
		 //Sort array
		 
		 public void sortAcending(int a[]) {
			 System.out.println();
			 System.out.print("Acending Oder:- "); 
			 for(int i =0; i<a.length; i++) {
				 for(int j = i + 1; j < a.length; j++) {
					 if(a[i]>a[j]) {
						 int temp = a[i];
						 a[i] = a[j];
						 a[j] = temp;
					 }
				 }
				 System.out.print(+ a[i] + " ");
			 }	 	
			
		}
		 
		 public void sortDec(int a[]) {
			 System.out.println();
			 System.out.print("Decending order:- ");
			 for(int i =0; i<a.length; i++) {
				 for(int j = i + 1; j < a.length; j++) {
					 if(a[i]<a[j]) {
						 int temp = a[i];
						 a[i] = a[j];
						 a[j] = temp;
					 }
					
				 } System.out.print(a[i] + " ");
			 }	 	
			
		}
		 
		 
		 
		 
}
