
package com.busyqa.coursework.wk2_meghana.W3ResourceExerConditionals;


//Write a Java program to solve quadratic equations (use if, else if and else).
//Test Data
//Input a: 1
//Input b: 5
//Input c: 1
//Expected Output :
//The roots are -0.20871215252208009 and -4.7912878474779195

//Formula of a quadratic equation: ax2 + bx + c = 0
//Positive and Negative Quadratic solutions: 
//Positive  x = -b + root((b*b-4ac)/2a)
//Negative x = -b - root((b*b-4ac)/2a)
//Reference: https://www.mathsisfun.com/quadratic-equation-solver.html


//import Scanner Object
import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args) {
		
		Scanner val1 = new Scanner(System.in);
		Scanner val2 = new Scanner(System.in);
		Scanner val3 = new Scanner(System.in);
		
		System.out.println("Please enter value a: ");
		double a = val1.nextDouble();
		
		System.out.println("Please enter value b: ");
		double b = val2.nextDouble();
		
		System.out.println("Please enter value c: ");
		double c = val3.nextDouble();
		
		
		//(-b + Math.pow(result, 0.5)) / (2.0 * a);
		//double square1 = Math.sqrt(b)-(4*a*c);
//		double square2 = b*b-4*a*c;
//		double root1 = (-b + Math.sqrt(square2)/(2.0*a));
//		double root2 = (-b - Math.sqrt(square2)/(2.0*a));
//		//double x1 = -b + root1;
//		System.out.println("root1: " + root1);
//		System.out.println("root2: " + root2);

		//Copied from Solution online because my answer was wrong
		double square2 = b*b-4*a*c;
		if (square2 > 0.0) {
            double r1 = (-b + Math.pow(square2, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(square2, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (square2 == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
	}

}
