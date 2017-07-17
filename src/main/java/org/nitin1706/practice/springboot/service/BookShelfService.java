package org.nitin1706.practice.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.nitin1706.practice.springboot.model.BookDetails;
import org.nitin1706.practice.springboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookShelfService {
	
	@Autowired
	BookRepository bookRepository;
	
	private static List<BookDetails> books = Arrays.asList(
			new BookDetails("My First Book", "Nitin Bajaj", 89),
			new BookDetails("SCJP", "Kathy Sierra", 589),
			new BookDetails("5 Point Someone", "Chetan Bhagat", 219),
			new BookDetails("Bankster", "Ravi Subramaim", 289)
			);
	
	public List<BookDetails> getAllBooks() {
		return bookRepository.findAll();
	}
	
	public boolean saveBookDetails(BookDetails bookDetails) {
		bookRepository.save(bookDetails);
		return true;
	}
	
	public boolean removeBookDetails(String bookName) {
		List<BookDetails> bookDetailsList = bookRepository.findByTitle(bookName);
		if(bookDetailsList != null) {
			// System.out.println("Books are not null and size is : " + bookDetailsList.size());
			bookRepository.delete(bookDetailsList.get(0));
			System.out.println("Book deleted");
			return true;
		}
		return false;
	}
	
	public List<BookDetails> getBookByTitle(String title) {
		return bookRepository.findByTitle(title);
	}
	
	public Long booksCount() {
		return bookRepository.count();
	}
	
	public boolean removeBookById(String id) {
		bookRepository.delete(id);
		return true;
	}

}
