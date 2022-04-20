package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.CourseDAO;
import dao.CourseDAOIMPL;
import model.Clazz;
import model.Course;
import model.StudentClass;
import service.ClazzService;
import service.ClazzServiceIMPL;
import service.CourseService;
import service.CourseServiceIMPL;
import service.StudentClassService;
import service.StudentClassServiceIMPL;

public class MainStudentClass {

	public static void main(String[] args) {
		menuStudentClazz();
	}

	public static void menuStudentClazz() {
		while (true) {
			System.out.println("_____STUDENT-CLAZZ_____");
			System.out.println("1.Insert STUDENT-CLAZZ");
			System.out.println("2.Update STUDENT-CLAZZ");
			System.out.println("3.Delete STUDENT-CLAZZ");
			System.out.println("4.Read STUDENT-CLAZZ");
			System.out.println("5.SearchCLAZZName");
			System.out.println("6.Exit");

			System.out.println("Vui long chon !");

			int n = new Scanner(System.in).nextInt();
			if (n == 1) {
				write();
				break;
			} else if (n == 2) {
				update();
				break;
			} else if (n == 3) {
				delete();
				break;
			} else if (n == 4) {
				readAll();
				break;
			} else if(n == 5) {
				searchCLAZZName();
				break;
			} else {
				System.exit(n);
				break;
			}
		}
	}
	private static void searchCLAZZName() {

		StudentClassService scService = new StudentClassServiceIMPL();
		System.out.println("Nhap ten lop can tim: ");
		
		String name = new Scanner(System.in).nextLine();
		
		List<StudentClass> scList = scService.searchClazzName(name);
		
		for(StudentClass sc : scList) {
			scService.info(sc);
		}

	}

	private static void delete() {
		StudentClassService scService = new StudentClassServiceIMPL();
		System.out.println("Nhap id_clazz can xoa: ");

		int cid = new Scanner(System.in).nextInt();
		scService.delete(cid);
	}

	private static void readAll() {
		
		StudentClassService scService = new StudentClassServiceIMPL();
		List<StudentClass> lists = scService.getAll();
		
		System.out.println("Danh sach doc ra");
		
		for (StudentClass sc : lists) {
			scService.info(sc);
		}
	}

	private static void update() {
		
		StudentClassService scService = new StudentClassServiceIMPL();
		
		System.out.println("Cap nhat lai !");
		
		StudentClass sc = new StudentClass();
		scService.input(sc);
		scService.update(sc);
	}

	private static void write() {

		StudentClassService scService = new StudentClassServiceIMPL();
		
		while (true) {
			StudentClass sc = new StudentClass();
			scService.input(sc);
			scService.insert(sc);

			System.out.println("Thoat chon 0");
			int n = new Scanner(System.in).nextInt();
			if (n == 0) {
				break;
			}
		}
	}
}
