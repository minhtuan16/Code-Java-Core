package service;

import java.util.List;

import model.Clazz;

public interface ClazzService {

	void input(Clazz cs);
	
	void info(Clazz cs);
	
	// luu xuong file/database
	void insert(Clazz cs);
	
	void update(Clazz cs);
	
	void delete(int id);
	
	List<Clazz> getAll();
	
	List<Clazz> searchByCourseName(String Coursename);
}
