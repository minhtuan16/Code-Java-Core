package com.example.demo.entity_model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "khoahoc")
public class Course {

	@Id
	private int id;
	
	@Column(name = "name")
	private String name;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
