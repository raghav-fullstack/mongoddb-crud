package com.raghav.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.raghav.mongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
