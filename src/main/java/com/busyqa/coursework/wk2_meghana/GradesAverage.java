package com.busyqa.coursework.wk2_meghana;

//importing java.util to be able to use the Scanner class
//Learning from: https://www.w3schools.com/java/java_user_input.asp
import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
		
		//create new Scanner object
		Scanner myInObj = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		
		//Read user input
		int numStudents = myInObj.nextInt();
		System.out.println("Number of students is: " + numStudents);
		
		//create a grades array and save grades input by user
		//into the array
		System.out.println("Please Enter grades for: "+ numStudents +" students" );
		int[] grades = new int[numStudents];
		for(int i=0;i<=numStudents-1;i++)
		{	System.out.println("Please enter grade for student "+(i+1)+" : ");
			grades[i]= myInObj.nextInt();
			
			if(grades[i] > 100)
			{
			System.out.println("Invalid Grade! Try again");
			--i;
			continue;
			}
			else 
			{
			System.out.println("Grade for Student "+(i+1) + " is :" + grades[i]);
			}
		}
		System.out.println("\n");
		for(int j=0;j<=grades.length-1;j++)
		{
			System.out.println("The grades entered are: " + grades[j]);
		}
		System.out.println("\n");
		int avg=0;
		int total=0;
		
		for(int i=0;i<=grades.length-1;i++)
		{
			 total += grades[i];
		}
		avg = total/numStudents;
		System.out.println("The Average of all grades is: " + avg);
	}

}
