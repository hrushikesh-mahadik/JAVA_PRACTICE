package com.oops.inheritance;

import java.util.Scanner;

public class Tiger extends Animal {

	private String sound;
	private String food;

    public Tiger() {
    	acceptDataTiger(); 
    showDataTiger();	
    }

    public Tiger(String sound, String food) {
       
    	setfood(sound);
        setsound(sound);
        
    }


    public String getsound() {
        return sound;
    }

    public void setsound(String sound) {
        this.sound = sound;
    }

    public String getfood() {
        return sound;
    }

    public void setfood(String food) {
        this.food = food;
    }

    public void acceptDataTiger() {

        acceptDataAnimal();

        Scanner sc = new Scanner(System.in);

        System.out.print("SOUND  : ");
        sound = sc.nextLine();

          }

    public void showDataTiger() {

        System.out.println("Tiger Details");
        showDataAnimal();
        System.out.println("Sound : " + sound);
}
}