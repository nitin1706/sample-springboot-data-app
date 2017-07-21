package org.nitin1706.practice.springboot.bookshelf;

import java.util.ArrayList;
import java.util.List;

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
	 * 
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
	 * 
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, value="/books")
	public List<BookDetails> saveBook(@RequestBody BookDetails bookDetails) {
		//BookDetails addBookNow = new BookDetails("newBook", "myself", 139);
		bookShelfService.saveBookDetails(bookDetails);
		System.out.println("Book Added");
		System.out.println("Total number of books now is: " + bookShelfService.booksCount());
		return bookShelfService.getAllBooks();
		//return books;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/books/{title}")
	public List<BookDetails> updateBook(@RequestBody BookDetails bookDetails, @PathVariable String title) {
		bookShelfService.updateBookDetails(bookDetails, title);
		return bookShelfService.getAllBooks();
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(method=RequestMethod.DELETE, value="/books/{title}")
	public String removeBook(@PathVariable String title) {
		return ((Boolean)(bookShelfService.removeBookDetails(title))).toString();
	}
	
	/**
	 * @return
	 */
	@RequestMapping("/books/total")
	public String totalBooksCount() {
		return bookShelfService.booksCount().toString();
	}
	
	/**
	 * @return
	 */
	/*@RequestMapping("/removeBookById/{id}")
	public String removeBookByBookId(String id) {
		return ((Boolean)bookShelfService.removeBookById(id)).toString();
	}*/
}
