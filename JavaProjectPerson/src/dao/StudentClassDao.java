package dao;

import java.util.List;

import model.Clazz;
import model.Course;
import model.StudentClass;

public interface StudentClassDao {
	void add(StudentClass sc);
	
	void update(StudentClass sc);
	
	void delete(int id_clazz);
	
	List<StudentClass> selectAll();
	
	List<StudentClass> searchClazzName(String ClazzName);
}
