package org.demo;

public class MainClass {
public static void main(String[] args) {
	
	System.out.println("Hello java");
	greet();

	printall();
	Customer c=new Customer();
	c.show();
}
public static void greet()
{
	System.out.println("Hello Greet");
	System.out.println("Hello Greet 2");
}
public static void printall()
{
	System.out.println("I am in printall");
}
}
