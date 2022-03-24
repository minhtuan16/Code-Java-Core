package service;

import java.util.Set;

import model.Person;

public interface SetExamService {

	Set<Person> input();
	
	void info(Set<Person> set);
	
	void filter(Set<Person> list);
	
	void delete(Set<Person> list);
}
