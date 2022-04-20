package dao;

import java.util.List;

import model.Course;

public interface CourseDAO {
	void add(Course c);
	
	void update(Course c);
	
	void delete(int id);
	
	List<Course> selectAll();
}
