package bai3.main;

import bai3.model.Student;
import bai3.service.StudentServiceImpl;

public class MainStudent1 {
	public static void main(String[] args) {
		Student student = new Student();
		
		StudentServiceImpl stuImpl = new StudentServiceImpl();
		stuImpl.input(student);
		stuImpl.info(student);
	}
}
