package com.busyqa.coursework.wk2_meghana.W3ResourceExerConditionals;

//Write a Java program that takes a year from user and print whether that year is a leap year or not.
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner inChannel1 = new Scanner(System.in);
		
		System.out.println("Please enter the year: ");
		
		int year = inChannel1.nextInt();
		
		System.out.println("You entered: " + year);
		
		//Check for Leap year
		//Should be divisible by 4 and 400
		//Should not be divisible by 100
		
		if(year%4==0 || year%400 ==0 && year%100 !=0) {
			System.out.println("The year " + year + " that you entered IS a LEAP YEAR!!!");
		}
		else
		{
			System.out.println("The year " + year + " that you entered IS NOT a LEAP YEAR!!!");
			
		}

	}

}
