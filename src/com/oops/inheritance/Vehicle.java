package com.oops.inheritance;

import java.util.Scanner;

public class Vehicle {

	private String name;
	private int price;
	private String fuel;
	
	public Vehicle() {
		
	}
	public Vehicle(String name,int price,String fuel) {
		setName(name);
		setPrice(price);
		setFuel(fuel);
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getFuel() {
		return fuel;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setFuel(String fuel) {
		this.fuel=fuel;
	}
	
	  public void acceptvaluevehicle() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Name  : ");
	        name = sc.nextLine();
	        System.out.print("Price  : ");
	        price = sc.nextInt();
	        System.out.print("Fuel : ");
	        fuel = sc.next();
	
	  }
	  
	  public void showvaluevehicle() {
	    System.out.println("Name: " +getName());
	    System.out.println("Price: " +getPrice());
	    System.out.println("Fuel: " +getFuel());
	  }
	
}
