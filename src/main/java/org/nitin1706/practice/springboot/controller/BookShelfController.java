package org.nitin1706.practice.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.nitin1706.practice.springboot.model.BookDetails;
import org.nitin1706.practice.springboot.service.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookShelfController {
	
	@Autowired
	BookShelfService bookShelfService;
	
	@RequestMapping("/category")
	public String allCategories() {
		return "All Categories Selected";
	}
	
	/**
	 * This is working
	 * @return
	 */
	@RequestMapping("/books")
	public List<BookDetails> allBooks() {
		return bookShelfService.getAllBooks();
	}
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/books/{title}")
	public List<BookDetails> findBookByTitle(@PathVariable String title) {
		return bookShelfService.getBookByTitle(title);
	}
	
	/**
	 * Add Book Details working
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, value="/addBook")
	public List<BookDetails> saveBook(@RequestBody BookDetails bookDetails) {
		//BookDetails addBookNow = new BookDetails("newBook", "myself", 139);
		bookShelfService.saveBookDetails(bookDetails);
		System.out.println("Book Added");
		System.out.println("Total number of books now is: " + bookShelfService.booksCount());
		return bookShelfService.getAllBooks();
		//return books;
	}
	
	/**
	 * Remove Book by title is not working
	 * @return
	 */
	@RequestMapping("/removeBook/{title}")
	public String removeBook(@PathVariable String title) {
		return ((Boolean)(bookShelfService.removeBookDetails(title))).toString();
	}
	
	/**
	 * Total Books Count working
	 * @return
	 */
	@RequestMapping("/totalBooksCount")
	public String totalBooksCount() {
		return bookShelfService.booksCount().toString();
	}
	
	/**
	 * remove by ID is working
	 * @return
	 */
	@RequestMapping("/removeBookById/{id}")
	public String removeBookByBookId(String id) {
		return ((Boolean)bookShelfService.removeBookById(id)).toString();
	}
}
