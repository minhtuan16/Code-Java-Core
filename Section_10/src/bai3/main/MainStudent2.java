package bai3.main;

import java.util.Scanner;

import bai3.model.Student;
import bai3.service.StudentServiceImpl;

public class MainStudent2 {
	public static void main(String[] args) {
		
		System.out.println("Nhap n-stu: ");
		int n = new Scanner(System.in).nextInt();
		
		Student[] students = new Student[n];
		StudentServiceImpl studentImpl = new StudentServiceImpl();
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			studentImpl.input(students[i]);
		}
		
		for(Student student : students) {
			studentImpl.info(student);
		}
	} 
}
