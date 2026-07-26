package com.array.jiosawan;

import java.util.Scanner;

import com.array.demo.Stud;

public class JioSawan {

    private int id;
    private int subAmt;
    private String lang;
    
    public static JioSawan user[] = new JioSawan[5];
    
   public static void acceptJiodataArray() {
	   for(int i = 0; i<user.length; i++) {
		   user[i]=new JioSawan();
		   user[i].acceptJioData();
	   }}

   
   public static void showJiodataArray() {
	   for(JioSawan s:user) {
		   s.showJioData();
	   }
   }
    // ==================== GETTERS ====================

    // Mistake: You named this method setId().
    // A method that returns a value should be named getId().
    public int getId() {
        return id;
    }

    // Mistake: This should be getAmt(), not setAmt().
    public int getAmt() {
        return subAmt;
    }

    // Mistake: This should be getLang(), not setLang().
    public String getLang() {
        return lang;
    }

    // ==================== SETTERS ====================

    // Mistake: You named this method getId(int id).
    // A method that stores a value should be named setId().
    public void setId(int id) {
        this.id = id;
    }

    // Mistake:
    // Method name should be setAmt().
    public void setAmt(int subAmt) {
        this.subAmt = subAmt;
    }

    // Mistake:
    // Method name should be setLang().
    public void setLang(String s) {
        this.lang = s;
    }

    public void acceptJioData() {

        System.out.println("Enter the Data");

        Scanner sc = new Scanner(System.in);

        // Mistake:
        // You wrote:
        // System.out.println("Enter lang" + setLang());
        // sc.next();
        //
        // setLang() returns nothing and you never stored the input.

       
        while(true) {
        	 System.out.print("Enter Language : ");
             String l = sc.next();
        	if (l.matches("[a-zA-Z]+")) {
                System.out.println("Valid Language: " + l);
                setLang(l);
                break;
                
            } else {
                System.out.println("Invalid! Enter only alphabets.");
                          
            }
        	
        }
        
        	
       

        // Mistake:
        // You used sc.next() for integer input.
        // Amount is int, so use nextInt().

        System.out.print("Enter Amount : ");
        setAmt(sc.nextInt());

        // Mistake:
        // You only called nextInt() without storing it.

        System.out.print("Enter ID : ");
        setId(sc.nextInt());
    }

    public void showJioData() {

        System.out.println("HERE IS DATA");

        // Mistake:
        // Earlier getId() was void, so it could not be printed.

        System.out.println("ID : " + getId());

        // Mistake:
        // Method name was getsubAmt().
        // Getter should return the value.

        System.out.println("Amount : " + getAmt());

        // Mistake:
        // Earlier getLang(String s) required a parameter.
        // Getter should not take any parameter.

        System.out.println("Language : " + getLang());
        
        
        
         
        	
        
    }
}