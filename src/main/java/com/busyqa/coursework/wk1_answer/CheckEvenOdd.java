package com.busyqa.coursework.wk1_answer;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setting value of number
        int number = 50;  
        
        //Displaying the number
        System.out.println("The number is " + number);
        
        //Checking if number has a remainder when divided by 2
        //if remainder == 0; the number is an even number
        //else the number is an odd number
        
        if(number%2 == 0) {
        	System.out.println("Number is an EVEN number");
        }
        else {
        	System.out.println("Number is an ODD number");
        }

	}

}
