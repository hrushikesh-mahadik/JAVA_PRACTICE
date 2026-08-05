package com.oops.inheritance;

import java.util.Scanner;

public class Iron extends Matal {

	private String geo;

	public Iron() {
		acceptDataIron();
		showDataIron();
	}

	public Iron(String geo) {

		setgeo(geo);
	}

	public String getgeo() {
		return geo;
	}

	public void setgeo(String geo) {
		this.geo = geo;
	}

	public void acceptDataIron() {

		acceptDataMetal();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter geo_loacation: ");
		geo = sc.nextLine();

	}

	public void showDataIron() {

		System.out.println("IRON Details");
		showDataMetal();
		System.out.println("geo : " + geo);

	}
}
