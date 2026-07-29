package com.oops.inheritance;

import java.util.Scanner;

public class Car  extends Vehicle{
	private String model;
	private int mailage;
	
	public Car() {
		
		
	}
	public Car(String model, int mailage) {
		setModel(model);
		setMailage(mailage);
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public void setMailage(int mailage) {
		this.mailage=mailage;
	}
	public String getModel() {
		return model;
	}
	public int  getMailage() {
		return mailage;
	}
	
	public void acceptcarvalue() {
		
		Scanner s = new Scanner(System.in);
		acceptvaluevehicle();
		System.out.print("MODEL: ");
		model = s.nextLine();
		System.out.print("Mailage: ");
		mailage = s.nextInt();
	}
	public void showcarvalue() {
		showvaluevehicle();
		System.out.println("Model: " + getModel());
		System.out.println("Mailage: " + getMailage());
	}
	
	
public static Car cars[] = new Car[2];
	
	public void acceptArray() {
		
		for(int i=0;i<cars.length;i++) {
					cars[i] = new Car();
				cars[i].acceptcarvalue();
			}
		}
	
	public void showArray() {
		for(Car s:cars) {
			s.showcarvalue();
		}
	}
	
	
}
