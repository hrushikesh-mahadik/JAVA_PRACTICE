package com.array.netfix;

import java.util.Scanner;

public class netflix {
	private int id;
	private int amt;
	private String l;
	
	public static netflix user[] = new netflix[3];
	
	public int getid() {
		return id;
	}
	public int getamt() {
		return amt;
	}
	public String getl() {
		return l;
	}
	
	public void setid(int id) {
		this.id=id;
	}
	public void setamt(int amt) {
		this.amt=amt;
	}
	public void setl(String l) {
		this.l=l;
	}
	
	public void acceptNetdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***ENTER THE USER DATA***");
		System.out.println("ENTER THE ID: ");
		setid(sc.nextInt());
		System.out.println("ENTER THE AMOUNT: ");
		setamt(sc.nextInt());
		System.out.println("ENTER THE LANGAGUE: ");
		setl(sc.next());
	}
	
	public void showNetdata() {
		System.out.println("HERE IS THE DATA");
		System.out.println("NAME: " + getid());
		System.out.println("AMOUNT: "+ getamt());
		System.out.println("LANGAGUE "+ getl());
	}
	
	public void acceptArray() {
		for(int i=0; i<user.length;i++) {
			user[i]=new netflix();
			user[i].acceptNetdata();
		}
	}
	public void showArray() {
		for(netflix n : user) {
			n.showNetdata();
		}
	}
	
		public void sortArray() {
			for(int i=0;i<user.length;i++) {
				for(int j=i+1;j<user.length;j++) {
					if(user[i].getid()<user[j].getid()) {
						netflix t = user[i];
						user[i]=user[j];
						user[j]=t;
					}
				}
				showArray();
			}
		}
	
}
