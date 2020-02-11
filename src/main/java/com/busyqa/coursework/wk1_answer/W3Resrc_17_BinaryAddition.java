package com.busyqa.coursework.wk1_answer;

public class W3Resrc_17_BinaryAddition {
	
	public static void main(String[] args) {
	//Creating 2 char arrays to hold the Binary values that need to be added
		
		//creating 2 Integers 
		Integer num10 = new Integer(10101010);
		Integer num11 = new Integer(11001);
		
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
	
	//IF LOOP to check if bin2 > bin1
		if(bin2.length > bin1.length)
		{
		//finding the difference in length of the two arrays
		 diffLen = bin2.length - bin1.length;
		 
		//Initializing temp to have a length of diffLen + bin1.length
		 temp = new char[diffLen+bin1.length];
		 
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
		
		else if(bin1.length > bin2.length)
		{
			diffLen = bin1.length - bin2.length;
			temp2 = new char[diffLen+bin2.length];
			
			for(int i=0;i<=diffLen-1;i++)
			{
				//Add '0's to the start of array
				temp2[i] = '0';
			}
			
			for(int i=diffLen;i<=temp2.length-1;i++) {
					temp2[i] = bin2[i-diffLen];
			}
			
			binaryAdd(temp2,bin1);
		}
		//if the lengths of both arrays are equal
		else {
			binaryAdd(bin1,bin2);
		}
	}
	
	


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
			//carry = '1'; find result including the carry amount
			if(bin1[i]=='0' && bin2[i]=='0')
			{
				if(i==0) {
					binRes+="1"; 
					continue;
				}
				//if not the first element in the array, we add 1 to carry
				else {
					binRes+="1"; //1 from carry
					carry='0'; //carry becomes 0
					continue;
				}
			}
			else if(bin1[i]=='0' && bin2[i]=='1')
			{
				if(i==0) {
					binRes+="01"; 
					continue;
				}
				//if not the first element in the array, we add 1 to carry
				else {
					binRes+="0"; //carry 1 and bin2 is 1 so result is 0 carry 1
					carry = '1';
					continue;
				}
			}
			else if(bin1[i]=='1' && bin2[i]=='0')
			{
				if(i==0) {
					binRes+="01"; 
					continue;
				}
				//if not the first element in the array, we add 1 to carry
				else {
					binRes+="0";//carry 1 and bin1 is 1 so result is 0 carry 1
					carry = '1';
					continue;
				}
			}
			else if(bin1[i]=='1' && bin2[i]=='1')
			{
				//Check if i is 0 which means that we are at the start of the array
				//so no carry; just put the value as is (here we put a reverse value because
				//the entire result is reversed at the end
				if(i==0) {
					
					binRes+="11"; //carry=1 bin1=1 bin2=1 - result 11 for the 0th position
					continue;
				}
				//if not the first element in the array, we add 1 to carry
				else {
					
					binRes+="1"; //carry=1 bin1=1 bin2=1 - result 1 and carry 1 
					carry='1';
					continue;
				}
			}
			
			
		}
		// if carry has a value 0 then do this
		else if(carry == '0')
		{
			if(bin1[i]=='0' && bin2[i]=='0')
			{
				binRes+="0";//carry=0 bin1=0 bin2=0 so result=0
				carry = '0';
				continue;
				
			}
			else if(bin1[i]=='0' && bin2[i]=='1')
			{
				binRes+="1";//carry=0 bin1=0 bin2=1 so result=1 and carry=0
				carry='0';
				continue;
				
			}
			else if(bin1[i]=='1' && bin2[i]=='0')
			{
				
				binRes+="1";//carry=0 bin1=1 bin2=0 so result=1 and carry=0
				carry='0';
				continue;
			}
			else if(bin1[i]=='1' && bin2[i]=='1')
			{
				if(i==0) {
					binRes+="01";//reverse from 10; carry=0 bin1=1 bin2=1 so result=10
					carry='0';
					continue;
				}
				else {
					binRes+="0";//carry=0 bin1=1 bin2=1 so result=0 and carry=1
					carry='1';
					continue;
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





