package com.busyqa.coursework.wk2_meghana;

public class Author {
	//instance variables
	 String firstName;
	 String lastName;
	
	//constructor
	public Author() {
		this.firstName = "Lee";
		this.lastName = "Bruceville";
		
	}
	
	//constructor with parameters
	
	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//toString override
	@Override
	public String toString() {
		return "Author [firstName=" + getFirstName() + ", lastName=" + getLastName() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author();
		System.out.println(author);
		
		Author author2 = new Author("Sharmishta","Chaturvedi");
		System.out.println(author2);

	}

	

	

	

}
