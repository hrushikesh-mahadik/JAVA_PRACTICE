package com.array.practice;

import java.util.Scanner;

public class PairEleArray extends IPOP{
public void pairelement(int a[]) {
	Scanner sc = new Scanner(System.in);
;
	System.out.println("Enter the Target Element:- " );
	int target = sc.nextInt();
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
		if(a[i]+a[j]==target) {
			System.out.println(a[i] + a[j]);
		}
		}
		}
	}
}


