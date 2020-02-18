package com.busyqa.coursework.wk1_meghana;

public class W3Resrc_17_BinaryAddition_OPTIMIZED {
	
	public static void main(String[] args) {
	//Creating 2 char arrays to hold the Binary values that need to be added
		
		//creating 2 Integers 
		Integer num10 = new Integer(1011);
		Integer num11 = new Integer(1110);
		
		//Converting them into string form
		String number1 = Integer.toString(num10);
		String number2 = Integer.toString(num11);
		
		//Converting the strings into char arrays
		char[] bin1 = number1.toCharArray();
		char[] bin2 = number2.toCharArray();
		
	//Creating the diffLen variable that will later be assigned the difference in lengths of both the arrays
		int diffLen = 0;
		
	//Creating two temporary arrays 
		char temp[];
		char temp2[];
		
	
	//Check for the two array lengths and make them equal before passing into addition function - binaryAdd
	//IF LOOP to check if bin2 length > bin1 length
		if(bin2.length > bin1.length)
		{
			//finding the difference in length of the two arrays
			 diffLen = bin2.length - bin1.length;
			 
			//Initializing temp to have a length of diffLen + bin1.length
			 temp = new char[diffLen+bin1.length];
			 
			//Method to make both array lengths the same 
			 lengthEquator(diffLen,temp,bin1,bin2);
		
		}
	//ELSE IF bin1 length > bin2 length
		else if(bin1.length > bin2.length)
		{
			//finding the difference in length of the two arrays
			diffLen = bin1.length - bin2.length;
			
			//Initializing temp to have a length of diffLen + bin2.length
			temp = new char[diffLen+bin2.length];
			
			//Method to make both array lengths the same
			lengthEquator(diffLen,temp,bin2,bin1);
			
		}
		
	//ELSE if the lengths of both arrays are equal
		else {
			//Passing the bin1 and bin2 arrays of same length to binaryAdd function to add the numbers
			binaryAdd(bin1,bin2);
		}
	}
	
//Method to make both array lengths the same
static void lengthEquator(int diffLen,char temp[],char bin1[],char bin2[]) {
	 
	//Making both the arrays to have the same length by adding zeros to the start of the smaller array
	 for(int i=0;i<=diffLen-1;i++)
		{
			//Add '0's to the start of array
			temp[i] = '0';
		}
	//Adding the smaller array to the temp array after the zeros. This makes both arrays equal in length
		for(int i=diffLen;i<=temp.length-1;i++) {
				temp[i] = bin1[i-diffLen];
		}
		
	//Passing the temp and bin2 arrays of same length to binaryAdd function to add the numbers
		binaryAdd(temp,bin2);
				
}

//Function to add two binary numbers of equal lengths
static void binaryAdd(char bin1[],char bin2[]){
	
	//Creating a temp variable to hold the carry value
	char carry = '0';
	
	//Create a holder for the Binary result
	String binRes = "";
		
	//Iterate bin1 in the reverse order
	for(int i=bin1.length-1;i>=0;i--)
	{
		
	//check if carry has a value 1
		if(carry == '1') {
			if(bin1[i]=='0' && bin2[i]=='0')
			{
				switch(i) {
				case 0 : {binRes+="1"; break;}
				default : {binRes+="1"; carry='0'; break;}
				
				}
			}
			else if(bin1[i]=='0' && bin2[i]=='1')
			{
				switch(i) {
				case 0 : {binRes+="01"; break;}
				default : {binRes+="0"; carry='1'; break;}
				}
			}
			else if(bin1[i]=='1' && bin2[i]=='0')
			{
				switch(i) {
				case 0 : {binRes+="01"; break;}
				default : {binRes+="0"; carry='1'; break;}
				}
			}
			else if(bin1[i]=='1' && bin2[i]=='1')
			{
				switch(i) {
				case 0 : {binRes+="11"; break;}
				default : {binRes+="1"; carry='1'; break;}
				}
			}
		}
			
		else if(carry == '0')
		{
			if(bin1[i]=='0' && bin2[i]=='0')
			{
				switch(i) {
				case 0 : {binRes+="0"; break;}
				default : {binRes+="0"; carry='0'; break;}
				}
			}
			else if(bin1[i]=='0' && bin2[i]=='1')
			{
				switch(i) {
				case 0 : {binRes+="1"; break;}
				default : {binRes+="1"; carry='0'; break;}
				}
			}
			else if(bin1[i]=='1' && bin2[i]=='0')
			{
				switch(i) {
				case 0 : {binRes+="1"; break;}
				default : {binRes+="1"; carry='0'; break;}
				}
			}
			else if(bin1[i]=='1' && bin2[i]=='1') 
			{
				switch(i) {
				case 0 : {binRes+="01"; carry='0'; break;}
				default : {binRes+="0"; carry='1'; break;}
				}
			}
		}
		}	
	
		//reverse the final output if length of nums is greater than 2 digits
		//reverse a string in Java using the StringBuilder class
				
				StringBuilder finalRes = new StringBuilder();
				finalRes.append(binRes);
				finalRes = finalRes.reverse();
				System.out.println(bin1);
				System.out.println(bin2);
				System.out.println("----------");
				System.out.println(finalRes);
			}
}





