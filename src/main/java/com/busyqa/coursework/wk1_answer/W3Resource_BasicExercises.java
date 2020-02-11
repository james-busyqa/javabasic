package com.busyqa.coursework.wk1_answer;

public class W3Resource_BasicExercises {

	public static void main(String[] args) {
	//1. Write a Java program to print 'Hello' on screen  
	//and then print your name on a separate line.
		System.out.println("1.------");
		System.out.println("Hello");
		System.out.println("I am Meghana");
		System.out.println(" ");
		
	//2. Write a Java program to print the sum of two numbers.
		System.out.println("2.------");
		int num1 = 74;
		int num2 = 36;
		int sum = num1 + num2;
		System.out.println("Sum of "+ num1 + " and " + num2 + " is "+ sum);
		System.out.println(" ");
		
	//3. Write a Java program to divide two numbers and print on the screen.
		System.out.println("3.------");
		double div1 = 50;
		double div2 = 3;
		double result = div1/div2;
		System.out.println("Result of dividing "+ div1 + " by "+ div2 + " is "+ result);
		System.out.println(" ");
		
	//4. Write a Java program to print the result of the following operations.	
		//Test Data: a. -5 + 8 * 6
			System.out.println("4.------");
			int a = -5; int b = 8; int c = 6;
			int resA = a + b * c;
			System.out.println(" -5 + 8 * 6 = " + resA);
			
		//Test Data: b. (55+9) % 9
			int a1 = 55; int b1 = 9; int c1 = 9;
			int resB = (a1+b1) % c1;
			System.out.println(" (55+9) % 9 = " + resB);
			
		//Test Data: c. 20 + -3*5 / 8
			int resC =  20 + -3*5 / 8;
			System.out.println(" 20 + -3*5 / 8 = " + resC);
			
		//Test Data: d. 5 + 15 / 3 * 2 - 8 % 3
			int resD = 5 + 15 / 3 * 2 - 8 % 3;
			System.out.println(" 5 + 15 / 3 * 2 - 8 % 3 = " + resD);
			System.out.println(" ");
		
	//5.Write a Java program that takes two numbers as input and display the product of two numbers.
			System.out.println("5.------");
			int n1 = 25;
			int n2 = 5;
			int product = n1 * n2;
			System.out.println("The product of " + n1 + " and " + n2 + " is = " + product);
			System.out.println(" ");
			
	//6. Write a Java program to print the sum (addition), multiply, 
			//subtract, divide and remainder of two numbers. 
			System.out.println("6.------");
			int first = 125;
			int second = 24;
			
			int add = first + second;
			int mult = first * second;
			int sub = first - second;
			int div = first / second;
			int mod = first % second;
			
			System.out.println("The two numbers are = " + first + second);
			System.out.println("Addition = " + sum);
			System.out.println("Multiplication = " + mult);
			System.out.println("Subtraction = " + sub);
			System.out.println("Division = " + div);
			System.out.println("Remainder = "+ mod);
			
			System.out.println(" ");
			
	//7. Write a Java program that takes a number as input 
			//and prints its multiplication table upto 10.
			
			System.out.println("7.------");
			
			int tableNum = 8;
			int calcVal = 0;
			
			System.out.println("Multiplication table of : " + tableNum);
			
			for(int i=0;i<=10;i++) {
				calcVal = tableNum * i;
				System.out.println(tableNum + " * " + i + " = " + calcVal);
			}
			
			System.out.println(" ");
			
	//8: Write a Java program to display the following pattern
			//Sample Pattern :

			//	   J    a   v     v  a                                                  
			//	   J   a a   v   v  a a                                                 
			//	J  J  aaaaa   V V  aaaaa                                                
			//	 JJ  a     a   V  a     a	
			
			System.out.println("8.------");
			
			System.out.println("    J    a   v     v   a");
			System.out.println("    J   a a   v   v   a a");
			System.out.println(" J  J  aaaaa   V V   aaaaa");
			System.out.println("  JJ  a     a   V   a     a");
			
			System.out.println(" ");
			
	//9. Write a Java program to compute the specified expressions and print the output.
	//Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
	//Expected Output : 2.13888888888888
			
			System.out.println("9.------");
			
			//using a double because the result is a decimal number
			
			double compResult = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
			System.out.println("Computed Results: " + compResult);
			
			System.out.println(" ");
			
	//10. Write a Java program to compute a specified formula.
			//Specified Formula :
			//4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
			//Expected Output :2.9760461760461765
			
			System.out.println("10.------");
			
			double formulaRes = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
			System.out.println("Formula Results: " + formulaRes);
			
			System.out.println(" ");
			
	//11. Write a Java program to print the area and perimeter of a circle.
			//Area = pi * r * r
			//Circumference =  2 * pi * r
			
			System.out.println("11.------");
			
			double radius = 7.5;
			double pi = 3.14;
			double area = pi * radius * radius;
			double perimeter = 2 * pi * radius;
			
			System.out.println("If radius is = " + radius);
			System.out.println("Area = " + area);
			System.out.println("Circumference = " + perimeter);
			
			System.out.println(" ");
			
	//12. Write a Java program that takes three numbers as input to 
			//calculate and print the average of the numbers. 
			//Average = sum of terms/ number of terms
			
			System.out.println("12.------");
			
			int num_a = 10;
			int num_b = 15;
			int num_c = 20;
			int avg = (num_a + num_b + num_c)/3;
			System.out.println("The average of "+ num_a + " , " + num_b + " , " + num_c + " is = " + avg);
			
			System.out.println(" ");
			
	//13.Write a Java program to print the area and perimeter of a rectangle.
			//Test Data: Width = 5.5 Height = 8.5
			//Area of a rectangle = width * length
			//perimeter of rectangle = 2*(width+length)
			
			System.out.println("13.------");
			 double wide = 5.5;
			 double len = 8.5;
			 double recArea = wide * len;
			 double recPerimeter = 2 * (wide+len);
			 System.out.println("Area of the rectangle that is " + wide + " wide and " + len + " high is = " + recArea );
			 System.out.println("Perimeter of the rectangle that is " + wide + " wide and " + len + " high is = " + recPerimeter );
			System.out.println(" ");
			
	//14.Write a Java program to print an American flag on the screen.
//			* * * * * * ==================================                          
//			 * * * * *  ==================================                          
//			* * * * * * ==================================                          
//			 * * * * *  ==================================                          
//			* * * * * * ==================================                          
//			 * * * * *  ==================================                          
//			* * * * * * ==================================                          
//			 * * * * *  ==================================                          
//			* * * * * * ==================================                          
//			==============================================                          
//			==============================================                          
//			==============================================                          
//			==============================================                          
//			==============================================                          
//			==============================================
			
			System.out.println("14.------");
			
			String line1 = "* * * * * * ==================================";
			String line2 = " * * * * *  ================================== ";
			String line3 = "==============================================";
			
			for(int i=0;i<=3;i++) {
				System.out.println(line1);
				System.out.println(line2);
			}
			System.out.println(line1);
			
			for(int j=0;j<=5;j++) {
				System.out.println(line3);
			}
			
			System.out.println(" ");
			
	//15. Write a Java program to swap two variables.
			System.out.println("15.------");
			int one = 123;
			int two = 500;
			
			System.out.println("Variable one contains :" + one );
			System.out.println("Variable two contains :" + two);
			
			//swap
			int temp = 0;
			temp = one;
			one = two;
			two = temp;
			
			System.out.println(" ");
			System.out.println("After swap..");
			System.out.println("Variable one contains :" + one );
			System.out.println("Variable two contains :" + two);
			
			
			System.out.println(" ");
			
	//16. Write a Java program to print a face.
//			Expected Output
//
//			 +"""""+                                                 
//			[| o o |]                                                
//			 |  ^  |                                                 
//			 | '-' |                                                 
//			 +-----+
			System.out.println("16.------");
			
			//use escape character to insert quotes \"
			System.out.println(" +\"\"\"\"\"+");
			System.out.println(" +\"\"\"\"\"+");
			System.out.println("[| o o |]");
			System.out.println(" |  ^  | ");
			System.out.println(" | '-' | ");
			System.out.println(" +-----+ ");
			
			System.out.println("\n"); //\n for newline
			
//17.Write a Java program to add two binary numbers.	
//Input Data: Input first binary number: 10
			//Input second binary number: 11
			//Expected Output  - Sum of two binary numbers: 101
			
			//Answer is seperate class - W3Resrc_17_BinaryAddition.java
			System.out.println("17.------");
			System.out.println("Answer in seperate class - W3Resrc_17_BinaryAddition.java");
			System.out.println(" ");
			
//18.Write a Java program to multiply two binary numbers.
			System.out.println("18.------");
			System.out.println("Answer in seperate class - W3Resrc_18_BinaryMultiplication.java");
			System.out.println(" ");
			
	}
}
