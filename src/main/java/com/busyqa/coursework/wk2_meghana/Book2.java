package com.busyqa.coursework.wk2_meghana;
public class Book2 extends Author {
	
	String title;
	Author author;
	double price;
	
	

	//paramatized constructor
	
	public Book2(String title, String authorFirstName, String authorLastName, double price) {
		this.title = title;
		this.author= new Author(authorFirstName,authorLastName);
		this.price = price;
		
		//this.author.setFirstName(authorFirstName); 
		//System.out.println("\n" + this.author.firstName);
		//this.author.setLastName(authorLastName);
	
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Book2 [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		
		//Author authorObj = new Author("Andrew", "Billiards");
		Book2 book = new Book2("My new life","Susan","McMillan",10.0);
		System.out.println(book);
		
		

	}


}
