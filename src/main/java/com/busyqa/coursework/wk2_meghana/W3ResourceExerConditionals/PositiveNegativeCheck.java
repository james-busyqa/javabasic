
//Write a Java program to get a number from the user and print whether it is positive or negative.

package com.busyqa.coursework.wk2_meghana.W3ResourceExerConditionals;

//importing the Scanner Object from java.util library to be able to use it to get input from user
import java.util.Scanner;

public class PositiveNegativeCheck {

	public static void main(String[] args) {
		
		//Creating an instance of the Scanner object
		Scanner getVal = new Scanner(System.in);
		
		System.out.println("Please Enter your number here");
		int num = getVal.nextInt();
		
		if(num>=0) {
			System.out.println("The number you wrote " + num + "is a POSITIVE number");
		}
		else if(num<0)
		{
			System.out.println("The number you wrote " + num + " is a NEGATIVE number");
		}
	}

}
