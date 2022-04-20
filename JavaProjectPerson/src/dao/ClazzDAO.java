package dao;

import java.util.List;

import model.Clazz;
import model.Course;

public interface ClazzDAO {
	void add(Clazz c);
	
	void update(Clazz c);
	
	void delete(int id);
	
	List<Clazz> selectAll();
	
	List<Clazz> searchByCourseName(String Coursename);
}
