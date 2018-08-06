package org.demo;

public class MainClass {
public static void main(String[] args) {
	
	System.out.println("Hello java");
	greet();

	Customer c=new Customer();
	c.show();
}
public static void greet()
{
	System.out.println("Hello Greet");
	System.out.println("Hello Greet 2");
}
}
