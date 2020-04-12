package basic;

import java.util.*;
import java.util.Scanner;

public class UseScanner {
	
	// scanner is a class from JDK whiich take input from user
	
	public static void main(String[] args) {
		// classname objectname= new constructoroclass();
		
		// scanner object created to take input from user
		Scanner input=new Scanner(System.in);
		// Print enter your name
		System.out.println("Enter your Name");
		//take string input from use
		String name=input.nextLine();
		// Display the name
		System.out.println("My name is " +name);
		
		System.out.println("Enter student id");
		int id=input.nextInt();
		System.out.println("Student id is "+id);
		
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Enter your address");
		String address=myScanner.nextLine();
		System.out.println("My address is: "+address);
		
		
		input.close(); //close scanner
		
		
	}
	
	
	
	

}
