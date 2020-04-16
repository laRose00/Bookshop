package com.sap.devcamp.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

import lombok.Data;


@Data
@Entity(name = "TEST_TABLE")
public class TestEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PK")
	private int key;
	
	@Column(name = "Value")
	private String value;
	
}
