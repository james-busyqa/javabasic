package com.busyqa.coursework.wk2_meghana.W3ResourceExerConditionals;

//Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

//import Scanner class to be able to get inputs from the user
import java.util.Scanner;
import java.math.BigDecimal;

public class FloatCompare {

	public static void main(String[] args) {
		
		Scanner val1 = new Scanner(System.in);
		Scanner val2 = new Scanner(System.in);
		
		System.out.println("Please enter the first decimal number to check");
		//float num1 = val1.nextFloat();
		
		BigDecimal f1 = new BigDecimal(val1.nextFloat());
		
		System.out.println("Please enter the second decimal number to check");
		//float num2 = val2.nextFloat();
		
		
		
		BigDecimal f2 = new BigDecimal(val2.nextFloat());
		
		System.out.println(f1.compareTo(f2));
		
		if(f1.compareTo(f2) != -1) {
			System.out.println("The two floating point numbers are the same");
		}
		else
		{
			System.out.println("The two floating point numbers entered are different!");
		}

	}

}
