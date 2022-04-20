package dao;

import java.util.List;

import model.Person;

public interface PersonDao {

	void insert(Person p);
	
	void update(Person p);
	
	void delete(int id);
	
	List<Person> selectAll();
	
}