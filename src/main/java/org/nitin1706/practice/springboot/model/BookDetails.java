package org.nitin1706.practice.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="book_details")
public class BookDetails {
	
	@Id
	private String bookId;
	private String title;
	private String author;
	private int pages;
	private double price;
	
	public BookDetails() {
		
	}
	public BookDetails(String bookId) {
		this.bookId = bookId;
	}
	public BookDetails(String title, String author, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
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
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", title=" + title + ", author=" + author + ", pages=" + pages
				+ ", price=" + price + "]";
	}
}
