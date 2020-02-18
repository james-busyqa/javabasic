package com.busyqa.coursework.wk2_meghana;

//importing java.util to be able to use Scanner object
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sentence = new Scanner(System.in);
		System.out.println("Enter sentence to be reversed: ");
		
		//receive input
		String line = sentence.nextLine();
		System.out.println("You wrote: " + line);
		
		 String reverse = "";
			for(int j=line.length()-1;j>=0;--j)
			{
				
				reverse = reverse + line.charAt(j);
			}
		
		
		System.out.println("The reverse sentence is: " + reverse);

	}

	@Override
	public String toString() {
		return "ReverseString [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
