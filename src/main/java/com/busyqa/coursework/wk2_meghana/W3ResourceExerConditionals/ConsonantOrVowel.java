package com.busyqa.coursework.wk2_meghana.W3ResourceExerConditionals;
//Write a Java program that takes the user to provide a single character from the alphabet. 
//Print Vowel or Consonant, depending on the user input. If the user input is not a letter 
//(between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.Scanner;

public class ConsonantOrVowel {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a single aphabet");
		String alphabet = input.nextLine();
		
		alphabet = alphabet.toLowerCase();
		
		if(alphabet.length() > 1) {
			System.out.println("Sorry! You entered more than one alphabet!");
		}
		else {
			
			System.out.println("You entered: "+ alphabet);
			
			switch(alphabet)
			{
			case "a" : {System.out.println("This is a VOWEL!"); break;}
			case "e" : {System.out.println("This is a VOWEL!"); break;}
			case "i" : {System.out.println("This is a VOWEL!"); break;}
			case "o" : {System.out.println("This is a VOWEL!"); break;}
			case "u" : {System.out.println("This is a VOWEL!"); break;}
			default : {System.out.println("This is a CONSONANT!"); break;}
			}
		}
		
		
	}

}
