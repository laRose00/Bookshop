package com.sap.devcamp.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sap.devcamp.bookstore.model.TestEntity;

public interface TestRepository extends JpaRepository<TestEntity, Integer> {

}
