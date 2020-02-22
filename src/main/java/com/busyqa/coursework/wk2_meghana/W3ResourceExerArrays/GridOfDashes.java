package com.busyqa.coursework.wk2_meghana.W3ResourceExerArrays;

import java.util.Arrays;

//Write a Java program to print the following grid.
//Expected Output :
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - - 

public class GridOfDashes {

	public static void main(String[] args) {
		
		String[] dashes = {
				"- - - - - - - - - -",
				"- - - - - - - - - -",
				"- - - - - - - - - -",
				"- - - - - - - - - -",
				"- - - - - - - - - -",
				"- - - - - - - - - -",
				"- - - - - - - - - -",
				"- - - - - - - - - -",
				"- - - - - - - - - -",
				"- - - - - - - - - -"};
		
		for(int j=0;j< dashes.length;j++) {
			System.out.println(dashes[j]);
		}
		
	}

}
