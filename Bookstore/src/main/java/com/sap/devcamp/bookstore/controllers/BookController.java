package com.sap.devcamp.bookstore.controllers;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.devcamp.bookstore.model.TestEntity;
import com.sap.devcamp.bookstore.repositories.TestRepository;
import com.sap.devcamp.bookstore.service.BookService;

@RestController
@RequestMapping("/api/v1")
public class BookController {
	
	private final BookService bookService;
	private final TestRepository testRepository;
	public BookController(BookService bookService, TestRepository testRepository) {
		this.bookService = bookService;
		this.testRepository = testRepository;
		bookService.save(new TestEntity());
		bookService.save(new TestEntity());
	}
	
//	@GetMapping(path="/book")
//	public ResponseEntity<List<TestEntity>>test(){
//		//return new ResponseEntity<String>("Funktionert", HttpStatus.OK);
//		return new ResponseEntity<List<TestEntity>>(bookService.getAll(), HttpStatus.OK);
//	}
//	
//	  @PutMapping(path = "/book", consumes = MediaType.APPLICATION_JSON_VALUE)
//	    public ResponseEntity<List<TestEntity>> saveBook(@RequestBody TestEntity book) {
//	        return new ResponseEntity<List<TestEntity>>(HttpStatus.OK);
//	       
//	    }
//	    @PostMapping (path= "/book", consumes = MediaType.APPLICATION_JSON_VALUE)
//	    public ResponseEntity updateBook(@RequestBody TestEntity book) {
//	        return new ResponseEntity(bookService.updateBook(book), HttpStatus.OK);
//	    }
	
	@GetMapping(path="books")
		List<TestEntity> all(){
		 return testRepository.findAll();
	}
	
	@PostMapping(path="books")
		TestEntity newTestEntity(@RequestBody TestEntity newTestEntity) {
		return testRepository.save(newTestEntity);
	}

	
}
