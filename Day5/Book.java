package com.htc.pakage3;

import java.io.Serializable;

public class Book extends Object implements Serializable {
	private int bookId;
	private String bookName;
	private int bookPrice;
	static {
		System.out.println("Static block fired ");
	}
	//constructor
	public Book() {
		System.out.println("Default constructor is fired");
		bookId=0;
		bookName="NULL";
		bookPrice=0;	
	}
	public Book(int bookId, String bookName, int bookPrice) {
		super();
		System.out.println("Overloded consdtructor is fired");
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	//setters and getters 
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId....=" + bookId + ", bookName****=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId != other.bookId)
			return false;
		return true;
	}
	 
	

}
