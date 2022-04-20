package main;

import java.util.List;
import java.util.Scanner;

import model.Person;
import model.Student;
import model.Teacher;
import service.PersonService;
import service.PersonServiceIMPL;
import service.StudentService;
import service.StudentServiceIMPL;
import service.TeacherService;
import service.TeacherServiceIMPL;

public class MainTeacher {

	public static void main(String[] args) {
		menuTeacher();
	}

	private static void menuTeacher() {
		while(true) {
			System.out.println("_____TEACHER_____");
			System.out.println("1.INSERT TEACHER");
			System.out.println("2.UPDATE TEACHER");
			System.out.println("3.DELETE TEACHER");
			System.out.println("4.LIST TEACHER");
			System.out.println("5.EXIT");
			
			System.out.println("\nVUI LONG CHON !");
			int n = new Scanner(System.in).nextInt();
			
			if(n == 1) {
				insert();
				break;
			} else if(n == 2) {
				update();
				break;
			} else if(n == 3) {
				delete();
				break;
			} else if(n == 4) {
				getAll();
				break;
			} else if(n == 5) {
				System.exit(0);
				break;
			} else {
				System.out.println("VUI LONG CHON LAI !\n");
			}
		}
		
	}

	private static void getAll() {

		TeacherService tService = new TeacherServiceIMPL();
		
		List<Teacher> lists = tService.read();
		for(Teacher t: lists) {
			tService.info(t);
		}
		
	}

	private static void delete() {

		TeacherService tService = new TeacherServiceIMPL();
		
		System.out.println("Nhap person_id can xoa: ");
		int n = new Scanner(System.in).nextInt();
		tService.delete(n);
	}

	private static void update() {
		
		TeacherService tService = new TeacherServiceIMPL();		
		
		System.out.println("Cap nhat lai !");
		Teacher t = new Teacher();
		tService.update(t);

	}

	private static void insert() {

		TeacherService tService = new TeacherServiceIMPL();		
		
		while(true) {
			System.out.println("Nhap them !");
			
			Teacher t = new Teacher();
			tService.input(t);
			tService.insert(t);
			
			System.out.println("Thoat an 0 (nhap so) !");
			int ts = new Scanner(System.in).nextInt();
			
			if(ts == 0) {
				break;
			}
		}
		
	}
	
}
