package service;

import java.util.List;

import model.Person;

public interface PersonService {

	void input(Person p);
	
	void info(Person p);
	
	void insert(Person p);
	
	void update(Person p);
	
	void delete(int id);
	
	List<Person> getAll();
}
