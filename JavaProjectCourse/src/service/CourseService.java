package service;

import java.util.List;

import model.Course;

public interface CourseService {

	void input(Course cs);
	
	void info(Course cs);
	
	// luu xuong file/database
	void insert(Course cs);
	
	void update(Course cs);
	
	void delete(int id);
	
	List<Course> getAll();
	
	
}
