package com.busyqa.coursework.wk2_meghana.W3ResourceExerConditionals;

//Take three numbers from the user and print the greatest number.
//import Scanner object
import java.util.Scanner;

public class GreatestOf3Nums {

	public static void main(String[] args) {
		
		
		Scanner obj1 = new Scanner(System.in);
	
		Scanner obj2 = new Scanner(System.in);
		
		Scanner obj3 = new Scanner(System.in);
		
		System.out.println("Please enter first number to compare: ");
		int num1 = obj1.nextInt();
		
		System.out.println("Please enter the second number to compare: ");
		int num2 = obj2.nextInt();
		
		System.out.println("Please enter the third number to compare: ");
		int num3 = obj3.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("Number 1 is the greatest number of the three");
		}
		else
		if(num2 > num1 && num2 > num3)
			{
				System.out.println("Number 2 is the greatest number of the three");
			}
		else
			if(num3 > num1 && num3 > num2)
			{
				System.out.println("Number 3 is the greatest number of the three");
			}
			else
			{
				System.out.println("Please add unequal numbers. Some numbers are equal");
				
			}

	}

}
