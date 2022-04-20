package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.CourseDAO;
import dao.CourseDAOIMPL;
import model.Course;
import service.CourseService;
import service.CourseServiceIMPL;

public class MainCourse {

	public static void main(String[] args) {
		menuCourse();
	}

	public static void menuCourse() {
		while (true) {
			System.out.println("-----COURSE MENU-----");
			System.out.println("1.Insert Course");
			System.out.println("2.Update Course");
			System.out.println("3.Delete Course");
			System.out.println("4.Read Course");
			System.out.println("5.Exit");

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
			} else {
				System.exit(n);
				break;
			}
		}
	}

	private static void delete() {
		CourseService courseService = new CourseServiceIMPL();
		System.out.println("Nhap id can xoa: ");

		int cid = new Scanner(System.in).nextInt();
		courseService.delete(cid);
	}

	private static void readAll() {
		Course course = new Course();
		CourseService courseService = new CourseServiceIMPL();
		List<Course> list = courseService.getAll();
		System.out.println("Danh sach doc ra");
		for (Course c : list) {
			courseService.info(c);
		}
	}

	private static void update() {
		CourseService courseService = new CourseServiceIMPL();
		System.out.println("Cap nhat lai !");
		Course course = new Course();
		courseService.input(course);
		courseService.update(course);
	}

	private static void write() {

		CourseService courseService = new CourseServiceIMPL();
//		Course course = new Course();
//		courseService.input(course);
//		courseService.insert(course);
		
		while (true) {
			Course course = new Course();
			courseService.input(course);
			courseService.insert(course);

			System.out.println("Thoat chon 0");
			int n = new Scanner(System.in).nextInt();
			if (n == 0) {
				break;
			}
		}
	}
}
