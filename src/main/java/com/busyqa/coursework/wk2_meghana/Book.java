package com.busyqa.coursework.wk2_meghana;

public class Book {

	private String title;
	private String author;
	private double price;
	
	//constructor
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//setters and getters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//toString override

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		
		Book book1 = new Book("Good Days in Java","Billy Joel",20.0);
		
		System.out.println(book1);

	}

	

}
