package com.sap.devcamp.bookstore.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.devcamp.bookstore.model.TestEntity;
import com.sap.devcamp.bookstore.service.BookService;

@RestController
@RequestMapping("/api/v1")
public class BookController {
	
	private final BookService bookService;
	public BookController(BookService bookService) {
		this.bookService = bookService;
		bookService.save(new TestEntity());
		bookService.save(new TestEntity());
	}
	
	@GetMapping(path="/test")
	public ResponseEntity<List<TestEntity>>test(){
		//return new ResponseEntity<String>("Funktionert", HttpStatus.OK);
		return new ResponseEntity<List<TestEntity>>(bookService.getAll(), HttpStatus.OK);
	}
	
}
