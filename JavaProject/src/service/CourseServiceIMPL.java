package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.CourseDAO;
import dao.CourseDAOIMPL;
import model.Course;

public class CourseServiceIMPL implements CourseService{

	@Override
	public void input(Course cs) {

		while(true) {
			try {
				System.out.println("Course ID: ");
				cs.setId(new Scanner(System.in).nextInt());
				
				System.out.println("Course Name: ");
				cs.setName(new Scanner(System.in).nextLine());
				break;
			} catch (Exception e) {
				System.out.println("nhap sai ! nhap lai");
			}
			
			
		}
	}

	@Override
	public void info(Course cs) {

		System.out.println("Course ID: " + cs.getId());
		System.out.println("Course Name: " + cs.getName());
	}

	@Override
	public void insert(Course cs) { // them course vao database (db)
		CourseDAO dao = new CourseDAOIMPL();
		System.out.println("Dua vao MySQL thanh cong !");
		dao.add(cs);
	}

	@Override
	public void update(Course cs) {
		CourseDAO dao = new CourseDAOIMPL();
		System.out.println("Cap nhat tren MySQL thanh cong !");
		dao.update(cs);
	}

	@Override
	public void delete(int id) {
		CourseDAO dao = new CourseDAOIMPL();
		System.out.println("Xoa tren MySQL thanh cong !");
		dao.delete(id);
	}

	@Override
	public List<Course> getAll() {
		CourseDAO dao = new CourseDAOIMPL();
		
		return dao.selectAll();
		
//		return new ArrayList<Course>();
	}
	

}
