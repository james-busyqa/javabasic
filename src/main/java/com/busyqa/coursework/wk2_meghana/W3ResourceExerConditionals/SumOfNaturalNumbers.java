package com.busyqa.coursework.wk2_meghana.W3ResourceExerConditionals;

//Write a program to accept a number as user input, find the natural numbers for that number and then display the sum of those natural numbers.

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner inNumber = new Scanner(System.in);
		
		System.out.println("Please Enter Number: ");
		int num = inNumber.nextInt();
		int[] naturals = new int[num];
		
		for(int i=0;i<=num-1;i++) {
			naturals[i] = i+1;
			System.out.println(naturals[i]);
		}
		
		int sum=0;
		for(int i=0;i<=naturals.length-1;i++){
			sum = sum + naturals[i];
			
		}
		
		System.out.println("The sum of the above natural numbers is = " + sum);
		

	}

}
