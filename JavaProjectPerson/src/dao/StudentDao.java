package dao;

import java.util.List;

import model.Person;
import model.Student;

public interface StudentDao {

	void insert(Student s);
	
	void update(Student s);
	
	void delete(int id);
	
	List<Student> selectAll();
	
}