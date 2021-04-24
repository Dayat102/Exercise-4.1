package person;

import java.util.Scanner;

public class Person
{
	Scanner sc = new Scanner (System.in);
	private String name=null;
    private int age,num;
    private char gender;
    
    Person() {
    	System.out.print("\nEnter name = ");
        this.name = sc.next();
        System.out.print("\nEnter age = ");
        this.age = sc.nextInt();
        System.out.print("\nEnter gender = ");
        this.gender = sc.next().charAt(0);
    }
    public String getname() {
		  return this.name;
	  }
	  
	  public int getage() {
		  return this.age;
	  }
	  
	  public char getgender() {
	 	  return this.gender;
	  }
    
}
   
