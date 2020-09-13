package com.busyqa.coursework.wk2_meghana.W3ResourceExerArrays;

//include Arrays library
import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.

public class SortNumAndStringArray {

	public static void main(String[] args) {
		
		//define numeric array
		
		int[] arrNums = {4,5,23,1,3,5,6};
		Arrays.sort(arrNums);
		System.out.println(Arrays.toString(arrNums));
		
		String[] arrStrs = {"Spring","Summer","Winter","Fall"};
		Arrays.sort(arrStrs);
		System.out.println(Arrays.toString(arrStrs));
		

	}

	

}
