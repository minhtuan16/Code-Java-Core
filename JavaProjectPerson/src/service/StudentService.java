package service;

import java.util.List;

import model.Student;

public interface StudentService {

	void input(Student p);

	void info(Student p);

	void insert(Student p);

	void update(Student p);

	void delete(int id);

	List<Student> read();
}
