package dao;

import java.util.List;

import model.Person;
import model.Student;
import model.Teacher;

public interface TeacherDao {

	void insert(Teacher t);
	
	void update(Teacher t);
	
	void delete(int id);
	
	List<Teacher> selectAll();
	
}