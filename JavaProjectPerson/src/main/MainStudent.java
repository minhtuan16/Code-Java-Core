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

public class MainStudent {

	public static void main(String[] args) {
		menuStudent();
	}

	private static void menuStudent() {
		while(true) {
			System.out.println("_____STUDENT_____");
			System.out.println("1.INSERT STUDENT");
			System.out.println("2.UPDATE STUDENT");
			System.out.println("3.DELETE STUDENT");
			System.out.println("4.LIST STUDENT");
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

		StudentService sService = new StudentServiceIMPL();
		
		List<Student> list = sService.read();
		for(Student s: list) {
			sService.info(s);
		}
		
	}

	private static void delete() {

		StudentService  sService = new StudentServiceIMPL();
		System.out.println("Nhap person_id can xoa: ");
		int n = new Scanner(System.in).nextInt();
		sService.delete(n);
	}

	private static void update() {

		StudentService  sService = new StudentServiceIMPL();
		System.out.println("Cap nhat lai !");
		Student s = new Student();
		sService.update(s);

	}

	private static void insert() {

		StudentService sService = new StudentServiceIMPL();
		
		while(true) {
			System.out.println("Nhap them !");
			Student s = new Student();
			sService.input(s);
			sService.insert(s);
			
			System.out.println("Thoat an 1 (nhap so) !");
			int t = new Scanner(System.in).nextInt();
			
			if(t == 1) {
				break;
			}
		}
		
	}
	
}
