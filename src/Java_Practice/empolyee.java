package Java_Practice;

import java.util.Scanner;

class epm{
	private int id;
	private String name;
	private int age;
	private String post;
	
   public void setId(int id) {
	   this.id = id;
   }
   
   public void setName(String name) {
	   this.name = name;
   }
      
 
   public void setAge(int age) {
	   this.age = age;
   }
   
  
   public int getId(){
	   return id;
   }

   public int getAge(){
	   return age;
   }
   
   public String getName() {
	   return name;
   }
   
   public void acceptVal() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter ID: ");
	   setId(sc.nextInt());
	   System.out.println("enter Name: ");
	   setName(sc.next());
	   System.out.println("enter Age: ");
	   setAge(sc.nextInt());
	   
   }
	
   public void showVal() {
	   
	   System.out.println(getId());
	   System.out.println(getAge());
	   System.out.println(getName());
   }
	
}


public class empolyee {
public static void main(String[] args) {
	
	epm obj = new epm();
	obj.acceptVal();
	obj.showVal();
}
	
}
