package org.nitin1706.practice.springboot.repository;

import java.util.List;

import org.nitin1706.practice.springboot.model.BookDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<BookDetails, String> {
	
	List<BookDetails> findByTitle(String title);

}
