package com.example.demo.entity_model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//ORM:object relational mapping
@Entity
@Table(name = "giangvien") // table trong sql
public class Teacher {
	
	@Id
	private int id;
	
	@Column(name = "name")
	private String name;

	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public Teacher() {
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

