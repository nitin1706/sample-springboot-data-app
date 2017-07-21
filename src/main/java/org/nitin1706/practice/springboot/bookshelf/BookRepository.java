package org.nitin1706.practice.springboot.bookshelf;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<BookDetails, String> {
	
	List<BookDetails> findByTitle(String title);
	BookDetails findOneByTitle(String title);

}
