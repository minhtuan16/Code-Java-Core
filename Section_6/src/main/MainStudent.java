package main;

import java.util.Scanner;

import model.Student;

public class MainStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n sinh vien:");
		int n = sc.nextInt();
		
		Student[] students = new Student[n];
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].input();
		}
		

		//sap xep sinh vien tuoi tang dan
		System.out.println("======");
		for(int i = 0; i < students.length-1; i++) {
			for(int j = i+1; j < students.length; j++) {
				if(students[i].getAge() > students[j].getAge()) {
					Student temp = students[j];
					students[j] = students[i];
					students[i] = temp;
				}
			}
		}
		
		System.out.println("Sinh vien co tuoi tang dan: ");
		for(int i = 0; i < students.length; i++) {
			students[i].info();
		}
		
		
		//tim sinh vien tuoi lon nhat
		System.out.println("======");
		System.out.println("Sinh vien co tuoi lon nhat ! ");
		for(int i = 0; i < students.length; i++) {
			if(students[i].getAge() == students[students.length-1].getAge()) {
				students[i].info();
			}
		}
		
	}

}
