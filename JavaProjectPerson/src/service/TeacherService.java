package service;

import java.util.List;

import model.Student;
import model.Teacher;

public interface TeacherService {

	void input(Teacher t);

	void info(Teacher t);

	void insert(Teacher t);

	void update(Teacher t);

	void delete(int id);

	List<Teacher> read();
}
