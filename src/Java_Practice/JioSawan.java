package Java_Practice;

import java.util.Scanner;

class plan{
	private int id;
	private String name;
	private double amt;
	private String lang;
	
   public void setId(int id) {
	   this.id = id;
   }
   
   public void setName(String name) {
	   this.name = name;
   }
      
 
   public void setAge(double amt) {
	   this.amt = amt;
   }
   
   public void setLang(String lang) {
	   this.lang = lang;
   }
   
  
   public int getId(){
	   return id;
   }

   public double getAmt(){
	   return amt;
   }
   
   public String getName() {
	   return name;
   }
   
   public String getLang() {
	   return lang;
   }
   
   public void acceptVal() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter ID: ");
	   setId(sc.nextInt());
	   System.out.println("enter Name: ");
	   setName(sc.next());
	   System.out.println("enter amount: ");
	   setAge(sc.nextDouble());
	   System.out.println("enter laguage: ");
	   setLang(sc.next());
   }
	
   public void showVal() {
	   
	   System.out.println(getId());
	   System.out.println(getAmt());
	   System.out.println(getName());
	   System.out.println(getLang());
   }
	
	
}

public class JioSawan {
	public static void main(String[] args) {
		plan obj = new plan();
		obj.acceptVal();
		obj.showVal();
		
	}

}
