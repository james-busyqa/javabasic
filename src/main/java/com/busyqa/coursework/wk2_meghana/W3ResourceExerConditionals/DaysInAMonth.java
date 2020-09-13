package com.busyqa.coursework.wk2_meghana.W3ResourceExerConditionals;

//Write a Java program to find the number of days in a month.

import java.util.Scanner;

public class DaysInAMonth {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int numberOfDays = 0;
		
		System.out.println("Please enter the month number (1-12): ");
		int monthNum = obj.nextInt();
		
		int year = 2020;
		
		switch(monthNum) {
		case 1: { numberOfDays=31;break;}
		case 2: { 
				if(year%4 == 0 || year%400 == 0 && year%100 != 0)//Leap year: divisible by 4, 400 and not divisible by 100
					numberOfDays = 29;
				else
					numberOfDays = 28;
				break;}
		case 3: { numberOfDays=31; break;}
		case 4: { numberOfDays=30; break;}
		case 5: { numberOfDays=31; break;}
		case 6: { numberOfDays=30; break;}
		case 7: { numberOfDays=31; break;}
		case 8: { numberOfDays=31; break;}
		case 9: { numberOfDays=30; break;}
		case 10:{ numberOfDays=31; break;}
		case 11:{ numberOfDays=30; break;}
		case 12:{ numberOfDays=31; break;}
		}
		
		System.out.println("The number of Days in this month are: " + numberOfDays);

	}

}
