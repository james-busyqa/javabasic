package com.busyqa.coursework.wk2_meghana.Strings;

//test out the String methods - length(),concat(),trim(),charAt(),contains()
//equals(),equalsIgnoreCase(),replace(),substring(),toUppercase(),tolowerCase()

public class StringOperations1 {

	public static void main(String[] args) {
		
		//Declare 2 strings
		
		String wordOfTheDay = "Javalacious";
		String attachWord = "Spring Boots";
		String findWord = "Java";
		
		//length()
		System.out.println("Word of the Day is: " + wordOfTheDay 
				+ " which is of " + wordOfTheDay.length() + "chars in size.");
		
		//concat()
		String newStr = wordOfTheDay.concat(attachWord);
		System.out.println("We concatenated two strings");
		System.out.println("Word of the Day is: " + wordOfTheDay 
				+ " which is of " + wordOfTheDay.length() + "chars in size.");
		System.out.println("New String = "+ newStr);
		
		//trim() - triming newStr of any leading or trailing spaces
		newStr =  "  JavalaciousSpring Boots     ";
		System.out.println("Trimming the new string '" + newStr + "' = '"
						+newStr.trim() +"'");

		//charAt(index)
		char char1 = newStr.charAt(newStr.length() - 6);
		System.out.println("Char at newStr.length() - 6: "+ char1);
		
		//contains() - s.contains("txt")
		Boolean check = newStr.contains("Boots");
		System.out.println("newStr contains Boots? " + check);
		
		//equals()
		String newStr2 = "  Boo  ";
		Boolean equalCheck = newStr2.trim().equals("Boo");//method chaining
		System.out.println("newStr2 equals Boo? " + equalCheck);
		
		//equalsIgnoreCase()
		String newStr3 = "BOOOOOO";
		Boolean equiCheck = newStr3.equalsIgnoreCase("boooooo");
		System.out.println("newStr3 equals booooo? " + equiCheck);
		
		//replace()
		String replStr = "Hooooo!";
		String replaced = replStr.replace("Hoo", "Blooo");
		System.out.println(replStr + "replaced by " + replaced);
		
		//subString(starting Index, num of chars including starting index)
		String result = replStr.substring(0,4);
		System.out.println("Substring pulled from " + replStr + " is " + result);
		
		//toLowerCase() and toUpperCase()
		System.out.println("Upper case " + replStr + " = " + replStr.toUpperCase());
		System.out.println("Upper case " + replStr + " = " + replStr.toLowerCase());
	}

}
