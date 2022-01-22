package bai1.main;

import java.util.Scanner;

import bai1.model.Teacher;

public class MainTeacher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong giang vien: ");
		int n = sc.nextInt();
		
		Teacher[] teachers = new Teacher[n];
		
		for(int i = 0; i < teachers.length; i++) {
			teachers[i] = new Teacher();
			teachers[i].input();
		}
		
		for(Teacher teacher: teachers) {
			teacher.info();
		}
	}
}
