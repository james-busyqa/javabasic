package com.busyqa.coursework.wk2_meghana.W3ResourceExerConditionals;
//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. 

//import Scanner class
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
	
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 7");
		int wkDayNum = obj1.nextInt();
		
		switch(wkDayNum) {
		
		case 1: {System.out.println("Monday"); break;}
		case 2: {System.out.println("Tuesday"); break;}
		case 3: {System.out.println("Wednesday");break;}
		case 4: {System.out.println("Thursday");break;}
		case 5: {System.out.println("Friday");break;}
		case 6: {System.out.println("Saturday");break;}
		case 7: {System.out.println("Sunday"); break;}
		default: {System.out.println("Invalid Number! Bummer Day!");break;}
		
		}
		
		//obj1.close();

	}

}
