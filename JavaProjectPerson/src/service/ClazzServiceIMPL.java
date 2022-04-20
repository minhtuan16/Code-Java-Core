package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.ClazzDAO;
import dao.ClazzDAOIMPL;
import dao.CourseDAO;
import dao.CourseDAOIMPL;
import model.Clazz;
import model.Course;

public class ClazzServiceIMPL implements ClazzService {


	ClazzDAO clazzDAO = new ClazzDAOIMPL();
	@Override
	public void input(Clazz cs) {

		while(true) {
			try {
				System.out.println("Clazz ID: ");
				cs.setId(new Scanner(System.in).nextInt());
				
				System.out.println("Clazz Name: ");
				cs.setName(new Scanner(System.in).nextLine());
				
				System.out.println("Course ID: ");
				
				Course c = new Course();
				c.setId(new Scanner(System.in).nextInt());
				
				cs.setCourse(c);
				
				break;
			} catch (Exception e) {
				System.out.println("nhap sai ! nhap lai");
			}
			
			
		}
	}

	@Override
	public void info(Clazz cs) {

		System.out.println("Clazz ID: " + cs.getId());
		System.out.println("Clazz Name: " + cs.getName());
		
		if(cs.getCourse() != null) { // check course xem da ton tai chua
			System.out.println("Course:");
			CourseService courseService = new CourseServiceIMPL();
			courseService.info(cs.getCourse());
		}
		System.out.println("-------");
	}

	@Override
	public void insert(Clazz cs) { // them course vao database (db)
		ClazzDAO dao = new ClazzDAOIMPL();
		System.out.println("Dua vao MySQL thanh cong !");
		dao.add(cs);
	}

	@Override
	public void update(Clazz cs) {
		ClazzDAO dao = new ClazzDAOIMPL();
		System.out.println("Cap nhat tren MySQL thanh cong !");
		dao.update(cs);
	}

	@Override
	public void delete(int id) {
		ClazzDAO dao = new ClazzDAOIMPL();
		System.out.println("Xoa tren MySQL thanh cong !");
		dao.delete(id);
	}

	@Override
	public List<Clazz> getAll() {
		ClazzDAO dao = new ClazzDAOIMPL();
		
		return dao.selectAll();
		
//		return new ArrayList<Course>();
	}

	@Override
	public List<Clazz> searchByCourseName(String Coursename) {
		return clazzDAO.searchByCourseName(Coursename);
	}
	

}
