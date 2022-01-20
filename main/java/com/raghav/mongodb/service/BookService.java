package com.raghav.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghav.mongodb.model.Book;
import com.raghav.mongodb.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	public String saveBook(Book book) {
		repository.save(book);
		
		return "Book : "+book.getId()+" added Successfully";
	}

	public List<Book> getAll() {
		
		return repository.findAll();
	}

	public Optional<Book> getBookById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public String deleteById(int id) {
		repository.deleteById(id);
		
		return "Book "+id+"deleted successfully.";
		
	}
	
}
