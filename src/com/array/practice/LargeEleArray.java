package com.array.practice;

public class LargeEleArray extends IPOP {
	 public void findelementArray(int a[]) {
		 for(int i=0;i<a.length;i++) {
			 int y =a[i];     // first element but largest
			 for(int j=i+1;j<a.length;j++) {
				 if(a[j]>y) {
					 y=a[j];
				 }
			 }
			 System.out.println("largest element -: "+y);
			}
	 }
	 
}
