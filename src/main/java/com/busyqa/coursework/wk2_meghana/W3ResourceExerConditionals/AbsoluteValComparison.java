package com.busyqa.coursework.wk2_meghana.W3ResourceExerConditionals;

//Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". 
//Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

public class AbsoluteValComparison {

	public static void main(String[] args) {
		float num1 = -1000000.245F;
		
		if(num1 == 0)
		{
			System.out.println("Zero!");
		}
		else if(num1 >= 0) {
			System.out.println("Positive number !" + num1);
		}
		else if(num1 < 0) {
			System.out.println("Negative Number! " + num1);
		}
		
		double resAbs = Math.abs(num1);
		
		if(resAbs < 1) {
			System.out.println("This is a Small number!");
		}
		else
		if(resAbs > 1000000) {
			System.out.println("This is a Large number!");
		}

}
}
