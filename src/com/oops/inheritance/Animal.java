package com.oops.inheritance;

import java.util.Scanner;

public class Animal {
	


		    private String name;
		    private String color;
		    private String type;

		public Animal(){
			
		}
		public Animal(String name, String color,String type) {
			setName(name);
			setColor(color);
			settype(type);
		}
		

		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public String getColor() {
		        return color;
		    }

		    public void setColor(String color) {
		        this.color = color;
		    }
		    
		    public String gettype() {
		        return type;
		    }

		    public void settype(String type) {
		        this.type = type;
		    }

		    public void acceptDataAnimal() {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Name: ");
		        name = sc.nextLine();

		        System.out.print("Enter color: ");
		        color = sc.nextLine();
		        
		        System.out.print("Enter Type: ");
		        type = sc.nextLine();
		    }

		    public void showDataAnimal() {
		        System.out.println("Name : " + name);
		        System.out.println("Color  : " + color);
		        System.out.println("Type  : " + type);
		    }
		}



