package com.busyqa.coursework.wk2_meghana.W3ResourceExerArrays;

import java.util.Arrays;

public class SumArrayValues {

	public static void main(String[] args) {
		
		//Array of ints
		
		int[] arrInts = {20,30,10,4,0,9,6};
		
		//sum variable
		int sum = 0;
		
		for(int i=0;i<arrInts.length;i++) {
			sum += arrInts[i];
		}
		System.out.println("The sum of values: " + Arrays.toString(arrInts) +" is " + sum);

	}

}
