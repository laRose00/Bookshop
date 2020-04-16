package com.sap.devcamp.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sap.devcamp.bookstore.model.TestEntity;
import com.sap.devcamp.bookstore.repositories.TestRepository;

@Service
public class BookService {
	
	private TestRepository testRepository;
	
	public BookService(TestRepository testRepository) {
		this.testRepository = testRepository;
	}
	
	public void save(TestEntity entity) {
		testRepository.save(entity);
		}
	
	public List<TestEntity> getAll() {
		return testRepository.findAll();
	}
}
