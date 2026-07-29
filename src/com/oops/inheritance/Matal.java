package com.oops.inheritance;

import java.util.Scanner;

public class Matal {


	    private String name;
	    private String color;
	    private int melt;

	public Matal(){
		
	}
	public Matal(String name, String color,int melt) {
		setName(name);
		setColor(color);
		setmelt(melt);
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
	    
	    public int getmelt() {
	        return melt;
	    }

	    public void setmelt(int melt) {
	        this.melt = melt;
	    }

	    public void acceptDataMetal() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter color: ");
	        color = sc.nextLine();
	        System.out.print("Enter melting poin: ");
	        melt = sc.nextInt();
	    }

	    public void showDataMetal() {
	        System.out.println("Name : " + name);
	        System.out.println("Color  : " + color);
	        System.out.println("Melting point  : " + color);
	    }
	}

