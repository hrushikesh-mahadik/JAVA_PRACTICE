package com.array.book;

import java.util.Scanner;

public class books {
	
	private int price;
	private String author;
	private String name;

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
		}
	
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author=author;
		}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
		}
	
	public void accpetdataBook() {
		System.out.println("ENTER THE DATA OF BOOKS");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NAME: ");
		setname(sc.next());
		System.out.println("ENTER AUTHOR: ");
		setauthor(sc.next());
		System.out.println("ENTER PRICE: ");
		setPrice(sc.nextInt());
		}
	public void showdataBook() {
		System.out.println("**THE DATA OF BOOKS**");
		System.out.println("Name "+getname());
		System.out.println("Author "+getauthor());
		System.out.println("price "+getPrice());
	}
	public static books data[] = new books[3];
	
	public void arrayforBook() {
		for(int i=0;i<data.length;i++) {
			data[i]=new books();
			data[i].accpetdataBook();
			}
	}
		
	public void arrayforshowbook() {
		for(books s : data ) {
			s.showdataBook();
		}
		}
	public void sortedbook() {
		for(int i=0; i<data.length;i++) {
			for(int j=i+1; j<data.length;j++) {
				books t = data[i];
				data[i]=data[j];
				data[j]=t;
			}
			data[i].arrayforshowbook();
		}
	}
	}

