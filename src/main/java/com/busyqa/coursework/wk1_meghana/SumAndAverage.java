package com.busyqa.coursework.wk1_meghana;

public class SumAndAverage {
    public static void main (String[] args) {
        int sum = 0;          // Store the accumulated sum, init to 0
        double average;       // average in double
        int lowerbound = 1;   // The lowerbound to sum
        int upperbound = 100; // The upperbound to sum

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;     // same as "sum = sum + number"
        }
        
        // Compute average in double. Beware that int/int produces int.
        
        //Computing Average by converting upperbound from int to double
        double upperB = upperbound;
        average = sum/upperB;
        
        // Print sum and average.
        System.out.println("The sum is: " + sum);
        System.out.println("Ther average is: " + average);
    }
}
