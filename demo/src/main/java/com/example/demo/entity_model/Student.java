package com.example.demo.entity_model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//ORM:object relational mapping
@Entity
@Table(name = "sinhvien") // table trong sql
public class Student {
	
	@Id
	private int id;
	
	@Column(name = "name")
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public Student() {
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}