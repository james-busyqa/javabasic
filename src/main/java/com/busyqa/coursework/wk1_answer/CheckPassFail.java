package com.busyqa.coursework.wk1_answer;

public class CheckPassFail {  // Save as "CheckPassFail.java"
    public static void main(String[] args) {  
    
    //Setting value of mark	
       int mark = 49; 
       
    //Displaying the value of mark
       System.out.println("The mark is " + mark);
        
    //Checking if mark is >= 50; display PASS if true or FAIL if false   
       if(mark>=50) {
    	   System.out.println("PASS");
       }
       else {
    	   System.out.println("FAIL");
       }
       
    //Displaying DONE after operation is completed
       System.out.println("DONE");
        
    }
}