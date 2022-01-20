package com.raghav.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raghav.mongodb.model.Book;
import com.raghav.mongodb.repository.BookRepository;
import com.raghav.mongodb.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	@PostMapping("/addBooks")
	public String addBook(@RequestBody Book book) {
		
		return service.saveBook(book);
		
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getAllBook(){
		return service.getAll();
	}
	
	@GetMapping("/findAllBooks/{id}")
	public Optional<Book> getBookById(@PathVariable int id){
		return service.getBookById(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		return service.deleteById(id);
	}

}
