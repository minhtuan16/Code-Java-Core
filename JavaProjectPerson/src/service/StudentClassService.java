package service;

import java.util.List;

import model.Clazz;
import model.StudentClass;

public interface StudentClassService {

	void input(StudentClass sc);
	
	void info(StudentClass sc);
	
	// luu xuong file/database
	void insert(StudentClass sc);
	
	void update(StudentClass sc);
	
	void delete(int id_clazz);
	
	List<StudentClass> getAll();
	
	List<StudentClass> searchClazzName(String ClazzName);
}
