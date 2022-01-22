package bai1.main;

import java.util.Scanner;

import bai1.model.Student;

public class MainStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		
		Student[] students = new Student[n];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].input();
		}
		
		for(Student student : students) {
			student.info();
		}
		
	}
}
